package com.example.replicalogin.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.replicalogin.utils.Error


@Composable

fun ErrorDeCampo(errores: List<Error?>) {

    Texto(
        modifier = Modifier.padding(top = 40.dp, start = 5.dp),
        text = "Errors:",
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Normal,
        fontSize = 23,
        color = Color.Red,
        textDecoration = TextDecoration.None
    )

    Column(
        Modifier.fillMaxWidth()
    ) {
        for (error in errores) {
            if (error != null) {
                Row(
                    Modifier.fillMaxWidth()
                        .padding(start = 30.dp)
                ) {
                    Texto(
                        modifier = Modifier.padding(0.dp),
                        text = "·",
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal,
                        fontSize = 40,
                        color = Color.Red,
                        textDecoration = TextDecoration.None
                    )
                    Texto(
                        modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                        text = error.msg,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 21,
                        color = Color.Red,
                        textDecoration = TextDecoration.None
                    )
                }
            }
        }

    }
}