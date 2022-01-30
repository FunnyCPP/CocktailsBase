package com.kiienkoromaniuk.cocktailsbase.ui.themes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

data class CocktailsColors(
    val primaryText: Color,
    val primaryBackground: Color,
    val secondaryText: Color,
    val secondaryBackground: Color,
    val tintColor: Color,
    val controlColor: Color,
    val errorColor: Color
)

data class CocktailsTypography(
    val heading: TextStyle,
    val body: TextStyle,
    val toolbar: TextStyle,
    val caption: TextStyle
)

data class CocktailsShape(
    val padding: Dp,
    val cornersStyle: Shape
)

data class CocktailsImage(
    val mainIcon: Int,
    val mainIconDescription: String
)

object CocktailsTheme {
    val colors: CocktailsColors
        @Composable
        get() = LocalCocktailsColors.current

    val typography: CocktailsTypography
        @Composable
        get() = LocalCocktailsTypography.current

    val shapes: CocktailsShape
        @Composable
        get() = LocalCocktailsShape.current

    val images: CocktailsImage
        @Composable
        get() = LocalCocktailsImage.current
}

enum class CocktailslStyle {
    Purple, Orange, Blue, Red, Green
}

enum class CocktailsSize {
    Small, Medium, Big
}

enum class CocktailsCorners {
    Flat, Rounded
}

val LocalCocktailsColors = staticCompositionLocalOf<CocktailsColors> {
    error("No colors provided")
}

val LocalCocktailsTypography = staticCompositionLocalOf<CocktailsTypography> {
    error("No font provided")
}

val LocalCocktailsShape = staticCompositionLocalOf<CocktailsShape> {
    error("No shapes provided")
}

val LocalCocktailsImage = staticCompositionLocalOf<CocktailsImage> {
    error("No images provided")
}