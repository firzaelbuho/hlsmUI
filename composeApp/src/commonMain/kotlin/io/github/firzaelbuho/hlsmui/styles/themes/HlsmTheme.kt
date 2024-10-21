package io.github.firzaelbuho.hlsmui.styles.themes

import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShape


class HlsmTheme (
    val name:String = "default",
    val typography : Typography = Typography(),
    val hlsmColorScheme: HlsmColorScheme = HlsmColorScheme.Default,
    val shapes: Shapes = HlsmShape.Default
){
    companion object{



        val Default = HlsmTheme()
        val Candy = HlsmTheme(
            name = "Candy",
            hlsmColorScheme = HlsmColorScheme.Candy
        )
        val Chocolate = HlsmTheme(
            name = "Chocolate",
            hlsmColorScheme = HlsmColorScheme.Chocolate
        )

        val Cupcake = HlsmTheme(
            name = "Cupcake",
            hlsmColorScheme = HlsmColorScheme.Cupcake
        )
        val Elegant = HlsmTheme(
            name = "Elegant",
            hlsmColorScheme = HlsmColorScheme.Elegant
        )

        val Emerald = HlsmTheme(
            name = "Emerald",
            hlsmColorScheme = HlsmColorScheme.Emerald
        )

        val Forest = HlsmTheme(
            name = "Forest",
            hlsmColorScheme = HlsmColorScheme.Forest
        )

        val Galaxy = HlsmTheme(
            name = "Galaxy",
            hlsmColorScheme = HlsmColorScheme.Galaxy
        )

        val LangitBiru = HlsmTheme(
            name = "LangitBiru",
            hlsmColorScheme = HlsmColorScheme.LangitBiru
        )

        val Lavender = HlsmTheme(
            name = "Lavender",
            hlsmColorScheme = HlsmColorScheme.Lavender
        )

        val Nature = HlsmTheme(
            name = "Nature",
            hlsmColorScheme = HlsmColorScheme.Nature
        )

        val Ocean = HlsmTheme(
            name = "Ocean",
            hlsmColorScheme = HlsmColorScheme.Ocean
        )


        val Pastel = HlsmTheme(
            name = "Pastel",
            hlsmColorScheme = HlsmColorScheme.Pastel
        )


        val RedGroup = HlsmTheme(
            name = "RedGroup",
            hlsmColorScheme = HlsmColorScheme.RedGroup
        )

        val Sky = HlsmTheme(
            name = "Sky",
            hlsmColorScheme = HlsmColorScheme.Sky
        )

        val Sunset = HlsmTheme(
            name = "Sunset",
            hlsmColorScheme = HlsmColorScheme.Sunset
        )

        val Vintange = HlsmTheme(
            name = "Vintange",
            hlsmColorScheme = HlsmColorScheme.Vintange
        )




        fun getAllThemes():List<HlsmTheme>{
            val themes = listOf(
                HlsmTheme.Default,
                HlsmTheme.Candy,
                HlsmTheme.Chocolate,
                HlsmTheme.Elegant,
                HlsmTheme.Forest,
                HlsmTheme.RedGroup,
                HlsmTheme.Nature,
                HlsmTheme.Galaxy,
                HlsmTheme.Ocean,
                HlsmTheme.Pastel,
                HlsmTheme.Cupcake,
                HlsmTheme.Sunset,
                HlsmTheme.Lavender,
                HlsmTheme.Emerald,
                HlsmTheme.Sky,
                HlsmTheme.Vintange,
                HlsmTheme.LangitBiru

                )
            return themes
        }

    }
}