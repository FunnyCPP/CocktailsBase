package com.kiienkoromaniuk.cocktailsbase.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.kiienkoromaniuk.cocktailsbase.ui.UiConstants.TEXT_COLOR_DEFAULT

@Composable
fun TitleText(
    text: String,
    textColor: Color = TEXT_COLOR_DEFAULT,
    size: TextUnit = 16.sp,
) {
    Text(
        text = text,
        color = textColor,
        fontSize = size,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
    )
}