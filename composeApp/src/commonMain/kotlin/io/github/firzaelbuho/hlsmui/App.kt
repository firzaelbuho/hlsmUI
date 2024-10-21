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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.DarkModeSwitch
import org.jetbrains.compose.ui.tooling.preview.Preview

import io.github.firzaelbuho.hlsmui.composable.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.composable.ThemeSelector
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme


@Composable
@Preview
fun App() {


    val themes = HlsmTheme.getAllThemes()
    var currentTheme  by remember { mutableStateOf(HlsmTheme.Candy) }
    var isDark by remember {mutableStateOf(false)}

    HlsmAppTheme(
        hlsmTheme = currentTheme,
        isDark = isDark
    ){

        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
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
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.labelSmall
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
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.medium
        ){
            Text(
                text = "Medium Round",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.large
        ){
            Text(
                text = "Large Round",
                color = MaterialTheme.colorScheme.onPrimary
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
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Primary",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.secondary),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Secondary",
                color = MaterialTheme.colorScheme.onSecondary,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )

        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "tertiary",
                color = MaterialTheme.colorScheme.onTertiary,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }

    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "primary container",
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.secondaryContainer),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "secondary container",
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )

        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.tertiaryContainer),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "tertiary container",
                color = MaterialTheme.colorScheme.onTertiaryContainer,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }

    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.surface),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Surface",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.surfaceVariant),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Surface Variant",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )

        }
        Box(
            modifier = Modifier.size(100.dp).background(MaterialTheme.colorScheme.error),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "error",
                color = MaterialTheme.colorScheme.onError,
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }

    }
}