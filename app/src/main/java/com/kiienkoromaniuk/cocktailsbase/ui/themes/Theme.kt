package com.kiienkoromaniuk.cocktailsbase.ui.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainTheme(
    style: CocktailslStyle = CocktailslStyle.Purple,
    textSize: CocktailsSize = CocktailsSize.Medium,
    paddingSize: CocktailsSize = CocktailsSize.Medium,
    corners: CocktailsCorners = CocktailsCorners.Rounded,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when (darkTheme) {
        true -> {
            when (style) {
                CocktailslStyle.Purple -> purpleDarkPalette
                CocktailslStyle.Blue -> blueDarkPalette
                CocktailslStyle.Orange -> orangeDarkPalette
                CocktailslStyle.Red -> redDarkPalette
                CocktailslStyle.Green -> greenDarkPalette
            }
        }
        false -> {
            when (style) {
                CocktailslStyle.Purple -> purpleLightPalette
                CocktailslStyle.Blue -> blueLightPalette
                CocktailslStyle.Orange -> orangeLightPalette
                CocktailslStyle.Red -> redLightPalette
                CocktailslStyle.Green -> greenLightPalette
            }
        }
    }

    val typography = CocktailsTypography(
        heading = TextStyle(
            fontSize = when (textSize) {
                CocktailsSize.Small -> 24.sp
                CocktailsSize.Medium -> 28.sp
                CocktailsSize.Big -> 32.sp
            },
            fontWeight = FontWeight.Bold
        ),
        body = TextStyle(
            fontSize = when (textSize) {
                CocktailsSize.Small -> 14.sp
                CocktailsSize.Medium -> 16.sp
                CocktailsSize.Big -> 18.sp
            },
            fontWeight = FontWeight.Normal
        ),
        toolbar = TextStyle(
            fontSize = when (textSize) {
                CocktailsSize.Small -> 14.sp
                CocktailsSize.Medium -> 16.sp
                CocktailsSize.Big -> 18.sp
            },
            fontWeight = FontWeight.Medium
        ),
        caption = TextStyle(
            fontSize = when (textSize) {
                CocktailsSize.Small -> 10.sp
                CocktailsSize.Medium -> 12.sp
                CocktailsSize.Big -> 14.sp
            }
        )
    )

    val shapes = CocktailsShape(
        padding = when (paddingSize) {
            CocktailsSize.Small -> 12.dp
            CocktailsSize.Medium -> 16.dp
            CocktailsSize.Big -> 20.dp
        },
        cornersStyle = when (corners) {
            CocktailsCorners.Flat -> RoundedCornerShape(0.dp)
            CocktailsCorners.Rounded -> RoundedCornerShape(8.dp)
        }
    )

    val images = CocktailsImage(
        mainIcon = if (darkTheme) com.google.android.material.R.drawable.ic_clock_black_24dp else com.google.android.material.R.drawable.ic_clock_black_24dp,
        mainIconDescription = if (darkTheme) "Good Mood" else "Bad Mood"
    )

    CompositionLocalProvider(
        LocalCocktailsColors provides colors,
        LocalCocktailsTypography provides typography,
        LocalCocktailsShape provides shapes,
        LocalCocktailsImage provides images,
        content = content
    )
}