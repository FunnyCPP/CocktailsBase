package com.kiienkoromaniuk.cocktailsbase.ui.themes.shapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class CocktailTypeShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(path = drawCocktailTypePath(size = size))
    }

    private fun drawCocktailTypePath(size: Size): Path {
        return Path().apply {
            val item = size.height / 5F
            reset()
            lineTo(0F, size.height)
            lineTo(size.width, item * 4)
            lineTo(size.width, item)
            lineTo(0f, 0F)
            close()
        }
    }
}

