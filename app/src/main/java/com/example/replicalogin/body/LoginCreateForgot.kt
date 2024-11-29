package com.example.replicalogin.body

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.replicalogin.componentes.Texto


@Composable
fun LoginCreateForgot(onButtonPress:()-> Unit){
    Row(

        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.padding(bottom = 20.dp)
    ) {
        OutlinedButton (
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Red,
                contentColor = Color.White,
                disabledContentColor = Color.Red,
                disabledContainerColor = Color.Gray,
            ),
            modifier = Modifier
                .padding(start = 5.dp, top = 30.dp)
                .wrapContentWidth()
            ,
            shape = RoundedCornerShape(3.dp),
            onClick = { onButtonPress() },
            contentPadding = PaddingValues(9.dp),
            enabled = true
        ) {
            Texto(
                modifier = Modifier.padding(0.dp),
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontStyle = FontStyle.Normal,
                fontSize = 16,
                text = "Log in",
                textDecoration = TextDecoration.None
            )
        }
        Texto(
            modifier = Modifier.padding(start = 10.dp),
            color = Color.Gray,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontSize = 16,
            text = "or",
            textDecoration = TextDecoration.None
        )
        Texto(
            modifier = Modifier.padding(start = 3.dp),
            color = Color.DarkGray,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontSize = 16,
            text = "Create account",
            textDecoration = TextDecoration.Underline
        )
        Texto(
            modifier = Modifier.padding(start = 3.dp),
            color = Color.Gray,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontSize = 16,
            text = "·",
            textDecoration = TextDecoration.None
        )
        Texto(
            modifier = Modifier.padding(start = 3.dp),
            color = Color.DarkGray,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontSize = 16,
            text = "Forgot password",
            textDecoration = TextDecoration.Underline
        )
    }
}