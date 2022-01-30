package com.kiienkoromaniuk.cocktailsbase.ui.themes.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kiienkoromaniuk.cocktailsbase.ui.themes.CocktailsTheme
import com.kiienkoromaniuk.cocktailsbase.ui.themes.MainTheme
import com.kiienkoromaniuk.cocktailsbase.ui.themes.baseLightPalette
import com.kiienkoromaniuk.cocktailsbase.ui.themes.shapes.CocktailTypeShape

private val cocktailTypeWidth = 75.dp
private val cocktailTypeHeight = 150.dp

@Composable
fun CocktailType(
    text: String,
    backgroundColor: Color,
    textColor: Color,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit = {},
    modifier: Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = backgroundColor
        ),
        modifier = modifier
            .size(cocktailTypeWidth, cocktailTypeHeight)
            .fillMaxWidth()
            .graphicsLayer {
                shape = CocktailTypeShape()
                clip = true
            }

    ) {
        Text(
            text = text,
            style = CocktailsTheme.typography.body,
            color = textColor
        )
    }
}

@Preview
@Composable
fun CocktailType_Selected() {
    MainTheme(darkTheme = true) {
        CocktailType(
            "Shot",
            backgroundColor = baseLightPalette.secondaryText,
            textColor = baseLightPalette.primaryText,
            {},
            {},
            Modifier
        )
    }
}