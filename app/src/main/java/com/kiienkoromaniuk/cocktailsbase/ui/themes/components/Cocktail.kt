package com.kiienkoromaniuk.cocktailsbase.ui.themes.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Cocktails(
    text: String,
    backgroundColor: Color,
    textColor: Color,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit = {},
    modifier: Modifier
) {
    Box {

    }
}