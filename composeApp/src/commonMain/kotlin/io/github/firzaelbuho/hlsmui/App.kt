package io.github.firzaelbuho.hlsmui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

import io.github.firzaelbuho.hlsmui.composable.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.styles.colors.HlsmColors
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme
import io.github.firzaelbuho.hlsmui.styles.typography.HlsmTypography


@Composable
@Preview
fun App() {
    HlsmAppTheme(
        hlsmTheme = HlsmTheme(
//            hlsmColors = HlsmColors.Candy,
            isLight = false,
            typography = HlsmTypography.Default
        ),

    ){

        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Button Shapes",
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h5
            )
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
    }
}