package edu.iesam.examaad1eval

sealed class ErrorApp : Throwable() {
    object GenericErrorApp : ErrorApp() {
        private fun readResolve(): Any = GenericErrorApp
    }
}