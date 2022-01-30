package com.kiienkoromaniuk.cocktailsbase.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kiienkoromaniuk.cocktailsbase.ui.themes.MainTheme
import com.kiienkoromaniuk.cocktailsbase.ui.themes.baseLightPalette
import com.kiienkoromaniuk.cocktailsbase.ui.themes.components.CocktailType

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        baseLightPalette.primaryBackground,
                        baseLightPalette.secondaryBackground
                    )
                )
            )
    ) {
        Column(modifier = Modifier.align(Alignment.CenterStart)) {
            CocktailType(
                text = "Shot",
                backgroundColor = baseLightPalette.secondaryText,
                textColor = baseLightPalette.primaryBackground,
                onClick = { },
                {},
                Modifier.offset(0.dp, (30).dp)
            )
            CocktailType(
                text = "Long",
                backgroundColor = baseLightPalette.primaryBackground,
                textColor = baseLightPalette.primaryText,
                onClick = { },
                {},
                Modifier.offset(0.dp, (15).dp)
            )
            CocktailType(
                text = "Non alcohol",
                backgroundColor = baseLightPalette.secondaryBackground,
                textColor = baseLightPalette.secondaryText,
                onClick = { },
                {},
                Modifier.offset(0.dp, (0).dp)
            )
        }
    }
}

@Preview
@Composable
fun MainScreen_Shot() {
    MainTheme(darkTheme = true) {
        MainScreen()
    }
}