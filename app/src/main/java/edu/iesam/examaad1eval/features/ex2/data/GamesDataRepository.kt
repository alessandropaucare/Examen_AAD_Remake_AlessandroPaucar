package edu.iesam.examaad1eval.features.ex2.data

import edu.iesam.examaad1eval.ErrorApp
import edu.iesam.examaad1eval.features.ex2.data.local.GamesDbLocalDataSource
import edu.iesam.examaad1eval.features.ex2.data.remote.MockEx2RemoteDataSource
import edu.iesam.examaad1eval.features.ex2.domain.Ex2Repository
import edu.iesam.examaad1eval.features.ex2.domain.Game

class GamesDataRepository(
    private val localDataSource: GamesDbLocalDataSource,
    private val remoteDataSource: MockEx2RemoteDataSource
) : Ex2Repository {

    private val cacheSizeLimit = 5

    override suspend fun getGames(): Result<List<Game>> {

        try {

            val localGames = localDataSource.getAll()


            if (localGames.isEmpty()) {
                val remoteGames = remoteDataSource.getGames()
                localDataSource.saveAll(remoteGames.take(cacheSizeLimit))
                return Result.success(remoteGames)
            }

            val remoteGames = remoteDataSource.getGames()
            val combinedList = mutableListOf<Game>()

            combinedList.addAll(localGames)

            for (item in remoteGames) {
                if (!combinedList.any { it.id == item.id }) {
                    combinedList.add(item)
                }
            }

            localDataSource.saveAll(combinedList.take(cacheSizeLimit))

            return Result.success(localGames)


        } catch (e: Exception) {
                return Result.failure(ErrorApp.GenericErrorApp)
        }
    }

}