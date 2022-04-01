package com.kiienkoromaniuk.cocktailsbase.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.kiienkoromaniuk.cocktailsbase.ui.UiConstants.COCKTAIL_IMAGE_SIZE_DEFAULT

@ExperimentalCoilApi
@Composable
fun CocktailImage(
    image: String?,
    contentDescription: String? = null,
    size: Dp = COCKTAIL_IMAGE_SIZE_DEFAULT,
    shape: Shape = CircleShape,
    modifier: Modifier,
) {
    Image(
        painter = rememberImagePainter(image),
        contentDescription = contentDescription,
        modifier = modifier
            .size(size)
            .clip(shape)
    )
}