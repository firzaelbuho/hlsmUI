package io.github.firzaelbuho.hlsmui.styles.scheme


import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.CandyColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.ChocolateColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.CupcakeColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.ElegantColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.EmeraldColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.ForestColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.GalaxyColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.LangitBiruColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.LavenderColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.NatureColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.OceanColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.PastelColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.RedGroupColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.SkyColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.SunsetColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.VintageColorScheme


class HlsmColorScheme (
    val lightScheme : ColorScheme = lightColorScheme(),
    val darkScheme : ColorScheme = lightColorScheme()
){
    companion object{
        val Default = HlsmColorScheme()
        val Candy = CandyColorScheme
        val Chocolate = ChocolateColorScheme
        val Elegant = ElegantColorScheme
        val Forest = ForestColorScheme
        val LangitBiru = LangitBiruColorScheme
        val RedGroup = RedGroupColorScheme

        val Nature = NatureColorScheme
        val Galaxy = GalaxyColorScheme

        val Ocean = OceanColorScheme
        val Pastel = PastelColorScheme
//
        val Cupcake = CupcakeColorScheme
//
//
        val Sunset = SunsetColorScheme
        val Lavender = LavenderColorScheme
        val Emerald = EmeraldColorScheme
        val Sky = SkyColorScheme
        val Vintange = VintageColorScheme





//        fun generateVibrantColors(baseColor: Color): HlsmScheme {
//
//            return HlsmScheme()
//
//        }


    }
}
