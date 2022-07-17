package com.casestudy.core

sealed class DataState<T> {

    data class Error<T>(
        val uiComponent: Throwable?
    ): DataState<T>()

    data class Data<T>(
        val data: T? = null
    ): DataState<T>()

    data class Loading<T>(
        val progressBarState: ProgressBarState = ProgressBarState.Idle
    ): DataState<T>()
}


//sealed class DataState<T>(
//    val data: T? = null
//) {
//    class Success<T>(data: T) : DataState<T>(data)
//    class Loading<T>(data: T? = null) : DataState<T>(data)
//    class Error<T>(throwable: Throwable?, data: T? = null) : DataState<T>(data)
//}