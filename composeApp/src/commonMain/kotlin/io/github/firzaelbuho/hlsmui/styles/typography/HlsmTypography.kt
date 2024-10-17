package io.github.firzaelbuho.hlsmui.styles.typography

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val default = Typography(
    h1 = TextStyle(
        fontSize = 96.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-1.5).sp
    ),
    h2 = TextStyle(
        fontSize = 60.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-0.5).sp
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp
    ),
    h4 = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp
    ),
    h5 = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp
    ),
    h6 = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.15.sp
    ),
    subtitle1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.15.sp
    ),
    subtitle2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.1.sp
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 1.25.sp
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp
    ),
    overline = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.5.sp
    )
)

private val minimalistTypography = Typography(
    h1 = TextStyle(
        fontSize = 90.sp,
        fontWeight = FontWeight.Thin,
        letterSpacing = (-2).sp
    ),
    h2 = TextStyle(
        fontSize = 60.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-1).sp
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = 0.2.sp
    )
)

private val playfulTypography = Typography(
    h1 = TextStyle(
        fontSize = 96.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-1).sp,
    ),
    h2 = TextStyle(
        fontSize = 72.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.5.sp,
    ),
    body1 = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp
    ),
    body2 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.5.sp
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp,
    )
)

private val formalTypography = Typography(
    h1 = TextStyle(
        fontSize = 96.sp,
        fontWeight = FontWeight.Black,
        letterSpacing = (-1.5).sp
    ),
    h2 = TextStyle(
        fontSize = 60.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.5).sp
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp
    ),
    body2 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.4.sp
    ),
    overline = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.5.sp
    )
)

private val techyTypography = Typography(
    h1 = TextStyle(
        fontSize = 80.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = (-1).sp,
    ),
    h2 = TextStyle(
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
    ),
    subtitle1 = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.15.sp
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.5.sp
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp,
        color = Color(0xFF00E5FF) // Bright blue
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp
    )
)

private val elegantTypography = Typography(
    h1 = TextStyle(
        fontSize = 88.sp,
        fontWeight = FontWeight.Thin,
        letterSpacing = (-2).sp,
    ),
    h2 = TextStyle(
        fontSize = 60.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    subtitle1 = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.25.sp,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = 0.4.sp,
    ),
    overline = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.5.sp,
    )
)


private val modernBoldTypography = Typography(
    h1 = TextStyle(
        fontSize = 96.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-1.5).sp,
    ),
    h2 = TextStyle(
        fontSize = 60.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp,
    ),
    overline = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.5.sp,
    )
)

private val retroTypography = Typography(
    h1 = TextStyle(
        fontSize = 80.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-1).sp,
    ),
    h2 = TextStyle(
        fontSize = 64.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
    ),
    h4 = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 1.25.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp,
    )
)

private val luxuryTypography = Typography(
    h1 = TextStyle(
        fontSize = 88.sp,
        fontWeight = FontWeight.Black,
        letterSpacing = (-1.5).sp,
    ),
    h2 = TextStyle(
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.15.sp,
    ),
    h4 = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.25.sp,
    ),
    subtitle1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.15.sp,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp,
    )
)

private val minimalTypography = Typography(
    h1 = TextStyle(
        fontSize = 72.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-1.5).sp,
    ),
    h2 = TextStyle(
        fontSize = 56.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 40.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
    ),
    h4 = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 1.25.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp,
    ),
    overline = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.5.sp,
    )
)

private val casualTypography = Typography(
    h1 = TextStyle(
        fontSize = 80.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-1.5).sp,
    ),
    h2 = TextStyle(
        fontSize = 64.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
    ),
    h4 = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 1.25.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp,
    )
)

private val corporateTypography = Typography(
    h1 = TextStyle(
        fontSize = 84.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = (-1.5).sp
    ),
    h2 = TextStyle(
        fontSize = 68.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.5).sp
    ),
    h3 = TextStyle(
        fontSize = 52.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp
    ),
    h4 = TextStyle(
        fontSize = 40.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.25.sp
    ),
    subtitle1 = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.15.sp
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp
    )
)



class HlsmTypography {
    companion object{
        val Default = default
        val Minimalist = minimalistTypography
        val Playful = playfulTypography
        val Formal = formalTypography
        val Tech = techyTypography
        val Elegant = elegantTypography
        val ModernBold = modernBoldTypography
        val Retro = retroTypography
        val Luxury = luxuryTypography
        val Miniumal = minimalTypography
        val Casual = casualTypography
        val Corporate = corporateTypography

    }
}