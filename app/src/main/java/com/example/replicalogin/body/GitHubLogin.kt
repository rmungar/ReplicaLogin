package com.example.replicalogin.body

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.replicalogin.R
import com.example.replicalogin.componentes.Texto

@Composable
fun GitHubLogin(){
    OutlinedButton(
        onClick = {},
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.White,
            contentColor = Color.Red,
            disabledContentColor = Color.Red,
            disabledContainerColor = Color.Gray,
        ),
        border = BorderStroke(1.dp, Color.Red),
        modifier = Modifier.padding(start = 5.dp, bottom = 25.dp),
        contentPadding = PaddingValues(horizontal = 9.dp, vertical = 3.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.github_logo_png_seeklogo_304612),
            contentDescription = null,
            tint = Color.DarkGray,
            modifier = Modifier.size(25.dp)
        )
        Spacer(Modifier.width(3.dp))
        Texto(
            modifier = Modifier.padding(0.dp),
            text = "Log in with GitHub",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontSize = 16,
            color = Color.Red,
            textDecoration = TextDecoration.None
        )
    }
}