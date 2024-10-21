package io.github.firzaelbuho.hlsmui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.DarkModeSwitch
import org.jetbrains.compose.ui.tooling.preview.Preview

import io.github.firzaelbuho.hlsmui.composable.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.composable.ThemeSelector
import io.github.firzaelbuho.hlsmui.styles.colors.HlsmColors
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme
import io.github.firzaelbuho.hlsmui.styles.typography.HlsmTypography


@Composable
@Preview
fun App() {

    val yellow = HlsmTheme(
        name = "yellow",
        hlsmColors = HlsmColors.generateVibrantColors(Color.Yellow)
    )
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
        yellow
    )
    var currentTheme  by remember { mutableStateOf(HlsmTheme.Candy) }
    var isDark by remember {mutableStateOf(false)}

    HlsmAppTheme(
        hlsmTheme = currentTheme,
        isDark = isDark
    ){

        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {





            ThemeSelector(
                currentTheme,
                themes,
                onThemeSelected = {
                    currentTheme = it
                }
            )
            DarkModeSwitch(
                isDark = isDark,
                onModeChanged = {
                    isDark = it
                }
            )
            Text(
                text = "Button Shapes",
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h5
            )
            ButtonTest()
            BoxTest()



        }
    }
}

@Composable
fun ButtonTest(){
    Column(
        modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
    ){
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.small
        ){
            Text(
                text = "Small Round",
                color = MaterialTheme.colors.onPrimary
            )
        }
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.medium
        ){
            Text(
                text = "Medium Round",
                color = MaterialTheme.colors.onPrimary
            )
        }
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.large
        ){
            Text(
                text = "Large Round",
                color = MaterialTheme.colors.onPrimary
            )
        }
    }
}


@Composable
fun BoxTest(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colors.primary),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Primary",
                color = MaterialTheme.colors.onPrimary,
                fontSize = MaterialTheme.typography.caption.fontSize

            )
        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colors.secondary),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Secondary",
                color = MaterialTheme.colors.onSecondary,
                fontSize = MaterialTheme.typography.caption.fontSize
            )

        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colors.primaryVariant),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "1st Variant",
                color = MaterialTheme.colors.onPrimary,
                fontSize = MaterialTheme.typography.caption.fontSize
            )
        }

    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colors.secondaryVariant),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "2nd Variant",
                color = MaterialTheme.colors.onSecondary,
                fontSize = MaterialTheme.typography.caption.fontSize
            )
        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colors.error),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Error",
                color = MaterialTheme.colors.onError,
                fontSize = MaterialTheme.typography.caption.fontSize
            )

        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colors.surface),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Surface",
                color = MaterialTheme.colors.onSurface,
                fontSize = MaterialTheme.typography.caption.fontSize
            )
        }

    }
}