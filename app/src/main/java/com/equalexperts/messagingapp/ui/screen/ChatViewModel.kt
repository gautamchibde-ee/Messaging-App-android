package com.equalexperts.messagingapp.ui.screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChatViewModel : ViewModel() {

    private val _state = MutableStateFlow(ChatState())

    val state = _state.asStateFlow()

    data class ChatState(
        val message: String = "Chat App",
    )
}
