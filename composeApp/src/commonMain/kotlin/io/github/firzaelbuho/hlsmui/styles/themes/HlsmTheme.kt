package io.github.firzaelbuho.hlsmui.styles.themes

import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import io.github.firzaelbuho.hlsmui.styles.colors.HlsmColors
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShape
import io.github.firzaelbuho.hlsmui.styles.typography.HlsmTypography


class HlsmTheme (
    val name:String = "default",
    val typography: Typography = HlsmTypography.Default,
    val hlsmColors: HlsmColors = HlsmColors.Default,
    val shapes: Shapes = HlsmShape.Default
){
    companion object{

        val themes = listOf(
            HlsmTheme.Default,
            HlsmTheme.Candy,
            HlsmTheme.Chocolate,
            HlsmTheme.Elegant,
            HlsmTheme.Forest,
            HlsmTheme.LangitBiru,
            HlsmTheme.Nature,
            HlsmTheme.Ocean,
            HlsmTheme.Pastel,
            HlsmTheme.RedGroup,
            HlsmTheme.Cupcake,
            HlsmTheme.OceanBreeze,
            HlsmTheme.SunsetGlow,
            HlsmTheme.ForestDream,
            HlsmTheme.Lavender

        )

        val Default = HlsmTheme()
        val Candy = HlsmTheme(
            name = "Candy",
            hlsmColors = HlsmColors.Candy
        )
        val Chocolate = HlsmTheme(
            name = "Chocolate",
            hlsmColors = HlsmColors.Chocolate
        )
        val Elegant = HlsmTheme(
            name = "Elegant",
            hlsmColors = HlsmColors.Elegant
        )
        val Forest = HlsmTheme(
            name = "Forest",
            hlsmColors = HlsmColors.Forest
        )
        val LangitBiru = HlsmTheme(
            name = "Langit Biru",
            hlsmColors = HlsmColors.LangitBiru
        )
        val Nature = HlsmTheme(
            name = "Nature",
            hlsmColors = HlsmColors.Nature
        )
        val Ocean = HlsmTheme(
            name = "Ocean",
            hlsmColors = HlsmColors.Ocean
        )
        val Pastel = HlsmTheme(
            name = "Pastel",
            hlsmColors = HlsmColors.Pastel
        )
        val RedGroup = HlsmTheme(
            name = "Red Group",
            hlsmColors = HlsmColors.RedGroup
        )

        val Cupcake = HlsmTheme(
            name = "Cupcake",
            hlsmColors = HlsmColors.Cupcake
        )

        val OceanBreeze = HlsmTheme(
            name = "Ocean Breeze",
            hlsmColors = HlsmColors.OceanBreeze
        )

        val SunsetGlow = HlsmTheme(
            name = "Sunset Glow",
            hlsmColors = HlsmColors.SunsetGlow
        )

        val ForestDream = HlsmTheme(
            name = "Forest Dream",
            hlsmColors = HlsmColors.ForestDream
        )

        val Lavender = HlsmTheme(
            name = "Lavender",
            hlsmColors = HlsmColors.Lavender
        )

    }
}