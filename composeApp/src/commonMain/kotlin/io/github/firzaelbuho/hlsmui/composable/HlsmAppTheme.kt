package io.github.firzaelbuho.hlsmui.composable

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme


@Composable
fun HlsmAppTheme(hlsmTheme: HlsmTheme = HlsmTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (hlsmTheme.isLight) hlsmTheme.hlsmColors.light else hlsmTheme.hlsmColors.dark,
        shapes = hlsmTheme.shapes,
        typography = hlsmTheme.typography
    ){
        content()
    }
}