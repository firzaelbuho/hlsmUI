package io.github.firzaelbuho.hlsmui.styles.colors

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import io.github.firzaelbuho.hlsmui.styles.colors.scheme.CandyColors
import kotlin.random.Random




class HlsmColors (
    val light: Colors = lightColors(),
    val dark: Colors = darkColors(),
){
    companion object{
        val Default = HlsmColors()
        val Candy = CandyColors
    }
}
