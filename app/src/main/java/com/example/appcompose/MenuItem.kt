package com.example.appcompose

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.coroutines.internal.OpDescriptor

data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector
)
