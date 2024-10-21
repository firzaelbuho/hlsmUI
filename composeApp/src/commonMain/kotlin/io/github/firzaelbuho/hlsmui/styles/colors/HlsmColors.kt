package io.github.firzaelbuho.hlsmui.styles.colors

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.colors.template.CandyColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.ChocolateColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.CupcakeColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.ElegantColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.ForestColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.ForestDreamColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.LangitBiruColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.LavenderColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.NatureColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.OceanBreezeColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.OceanColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.PastelColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.RedGroupColors
import io.github.firzaelbuho.hlsmui.styles.colors.template.SunsetGlowColors


class HlsmColors (
    val light: Colors = lightColors(),
    val dark: Colors = darkColors(),
){
    companion object{
        val Default = HlsmColors()
        val Candy = CandyColors
        val Chocolate = ChocolateColors
        val Elegant = ElegantColors
        val Forest = ForestColors
        val LangitBiru = LangitBiruColors
        val Nature = NatureColors
        val Ocean = OceanColors
        val Pastel = PastelColors
        val RedGroup = RedGroupColors

        val Cupcake = CupcakeColors

        val OceanBreeze = OceanBreezeColors
        val SunsetGlow = SunsetGlowColors
        val ForestDream = ForestDreamColors
        val Lavender = LavenderColors





        fun generateVibrantColors(baseColor: Color): HlsmColors {

            return HlsmColors()

        }


    }
}
