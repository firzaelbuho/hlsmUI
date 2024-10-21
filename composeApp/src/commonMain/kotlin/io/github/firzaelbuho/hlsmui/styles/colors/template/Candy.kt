package io.github.firzaelbuho.hlsmui.styles.colors.template

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.colors.HlsmColors

private val darkCandy = Colors(
    primary = Color(0xFFFFC0CB),  // Pink pastel
    primaryVariant = Color(0xFFB0004E),  // Darker shade for primary container
    secondary = Color(0xFFADD8E6),  // Light blue pastel
    secondaryVariant = Color(0xFF4682B4),  // Darker shade for secondary container
    background = Color(0xFF2C2C2C),  // Dark background
    surface = Color(0xFF3E3E3E),  // Dark surface color
    error = Color(0xFFD32F2F),  // Error color

    onPrimary = Color(0xFF000000),  // Black for text on pink
    onSecondary = Color(0xFF000000),  // Black text on secondary
    onBackground = Color(0xFFE0E0E0),  // Light text for contrast
    onSurface = Color(0xFFE0E0E0),  // Light text on surface
    onError = Color(0xFFFFFFFF),  // White text on error

    isLight = false  // Indicates it's a dark theme
)

private val lightCandy = Colors(
    primary = Color(0xFFFFC0CB),  // Pink pastel
    primaryVariant = Color(0xFFFFB6C1),  // Lighter pink for primary container
    secondary = Color(0xFFADD8E6),  // Light blue pastel
    secondaryVariant = Color(0xFFB0E0E6),  // Lighter blue for secondary container
    background = Color(0xFFFFEFD5),  // Peach puff background
    surface = Color(0xFFFFF8DC),  // Light yellow surface
    error = Color(0xFFFF6347),  // Tomato red

    onPrimary = Color(0xFF000000),  // Black for text on pink
    onSecondary = Color(0xFF000000),  // Black text on secondary
    onBackground = Color(0xFF000000),  // Black for text on background
    onSurface = Color(0xFF000000),  // Black text on surface
    onError = Color(0xFFFFFFFF),  // White text on error

    isLight = true  // Indicates it's a light theme
)

internal val CandyColors = HlsmColors(
    dark = darkCandy,
    light = lightCandy
)

