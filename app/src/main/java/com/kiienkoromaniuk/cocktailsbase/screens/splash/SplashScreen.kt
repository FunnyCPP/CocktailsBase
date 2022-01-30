package com.kiienkoromaniuk.cocktailsbase.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kiienkoromaniuk.cocktailsbase.ui.themes.CocktailsTheme
import com.kiienkoromaniuk.cocktailsbase.ui.themes.baseLightPalette

@Composable
fun SplashScreen(navController: NavController) {
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
        Column(modifier = Modifier.align(Alignment.Center)) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Cocktails Base",
                style = CocktailsTheme.typography.heading,
                color = CocktailsTheme.colors.primaryText,
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp),
                text = "Full Compose App",
                style = CocktailsTheme.typography.body,
                color = CocktailsTheme.colors.secondaryText,
                textAlign = TextAlign.Center
            )
        }
    }
}