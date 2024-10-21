package io.github.firzaelbuho.hlsmui.composable

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme


@Composable
fun HlsmAppTheme(
    hlsmTheme: HlsmTheme = HlsmTheme(),
    isDark: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (isDark) hlsmTheme.hlsmColors.dark else hlsmTheme.hlsmColors.light,
        shapes = hlsmTheme.shapes,
        typography = hlsmTheme.typography
    ){
        content()
    }
}