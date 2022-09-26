package com.pktech.utill


sealed class RequestState<out T> {
    object Idea: RequestState<Nothing>()
    object Loading: RequestState<Nothing>()

    data class Success<T>(val data: T): RequestState<T>()
    data class Error(val error: Throwable): RequestState<Nothing>()
}