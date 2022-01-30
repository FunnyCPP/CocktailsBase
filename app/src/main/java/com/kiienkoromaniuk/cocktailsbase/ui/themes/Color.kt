package com.kiienkoromaniuk.cocktailsbase.ui.themes

import androidx.compose.ui.graphics.Color

val baseLightPalette = CocktailsColors(
    primaryBackground = Color(0xFF24202B),
    primaryText = Color(0xFFF2F2FB),
    secondaryBackground = Color(0xFF1F202C),
    secondaryText = Color(0xFFFFDD66),
    tintColor = Color.Magenta,
    controlColor = Color(0xFF7A8A99),
    errorColor = Color(0xFFFF3377),
)

val baseDarkPalette = CocktailsColors(
    primaryBackground = Color(0xFF24202B),
    primaryText = Color(0xFFF2F2FB),
    secondaryBackground = Color(0xFF1F202C),
    secondaryText = Color(0xFFFFDD66),
    tintColor = Color.Magenta,
    controlColor = Color(0xFF7A8A99),
    errorColor = Color(0xFFFF3377),
)

val purpleLightPalette = baseLightPalette.copy(
    tintColor = Color(0xFFAD57D9)
)

val purpleDarkPalette = baseDarkPalette.copy(
    tintColor = Color(0xFFD580FF)
)

val orangeLightPalette = baseLightPalette.copy(
    tintColor = Color(0xFFFF6619)
)

val orangeDarkPalette = baseDarkPalette.copy(
    tintColor = Color(0xFFFF974D)
)

val blueLightPalette = baseLightPalette.copy(
    tintColor = Color(0xFF4D88FF)
)

val blueDarkPalette = baseDarkPalette.copy(
    tintColor = Color(0xFF99BBFF)
)

val redLightPalette = baseLightPalette.copy(
    tintColor = Color(0xFFE63956)
)

val redDarkPalette = baseDarkPalette.copy(
    tintColor = Color(0xFFFF5975)
)

val greenLightPalette = baseLightPalette.copy(
    tintColor = Color(0xFF12B37D)
)

val greenDarkPalette = baseDarkPalette.copy(
    tintColor = Color(0xFF7EE6C3)
)