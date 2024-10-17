package io.github.firzaelbuho.hlsmui.styles.themes

import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import io.github.firzaelbuho.hlsmui.styles.colors.HlsmColors
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShape
import io.github.firzaelbuho.hlsmui.styles.typography.HlsmTypography


class HlsmTheme (
    val isLight: Boolean = false,
    val typography: Typography = HlsmTypography.Default,
    val hlsmColors: HlsmColors = HlsmColors.Default,
    val shapes: Shapes = HlsmShape.Default
)