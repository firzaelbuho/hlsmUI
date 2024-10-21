package io.github.firzaelbuho.hlsmui.composable

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme


@Composable
fun HlsmAppTheme(
    hlsmTheme: HlsmTheme = HlsmTheme(),
    isDark: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (isDark) hlsmTheme.hlsmColorScheme.darkScheme else hlsmTheme.hlsmColorScheme.lightScheme,
        shapes = hlsmTheme.shapes,
//        typography = hlsmTheme.typography
    ){
        content()
    }
}