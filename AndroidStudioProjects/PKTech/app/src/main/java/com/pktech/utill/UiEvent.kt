package com.pktech.utill

sealed class UiEvent {
    data class ShowSnackbar(
        val message: String,
        val action: String? = null
    ): UiEvent()
}
