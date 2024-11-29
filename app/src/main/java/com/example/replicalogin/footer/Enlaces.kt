package com.example.replicalogin.footer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.replicalogin.R
import com.example.replicalogin.componentes.Texto

@Composable
fun Enlaces(){
    Column(
        modifier = Modifier.fillMaxSize(),
        ) {
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Texto(
                modifier = Modifier.padding(start = 15.dp, end = 45.dp),
                text = "ABOUT",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20,
                textDecoration = TextDecoration.None,
                color = colorResource(R.color.IconosRedesSociales)
            )
            Texto(
                modifier = Modifier.padding(start = 15.dp, end = 75.dp),
                text = "FAQ",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20,
                textDecoration = TextDecoration.None,
                color = colorResource(R.color.IconosRedesSociales)
            )
            Texto(
                modifier = Modifier.padding(start = 15.dp),
                text = "BLOG",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20,
                textDecoration = TextDecoration.None,
                color = colorResource(R.color.IconosRedesSociales)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Texto(
                modifier = Modifier.padding(start = 15.dp, top = 20.dp),
                text = "CONTACT US",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20,
                textDecoration = TextDecoration.None,
                color = colorResource(R.color.IconosRedesSociales)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Texto(
                modifier = Modifier.padding(start = 15.dp, top = 20.dp, bottom = 20.dp),
                text = "Copyright © 2024 itch corp",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontSize = 20,
                textDecoration = TextDecoration.None,
                color = colorResource(R.color.IconosRedesSociales)
            )
        }
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Texto(
                modifier = Modifier.padding(start = 15.dp, end = 30.dp),
                text = "Directory",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontSize = 20,
                textDecoration = TextDecoration.Underline,
                color = colorResource(R.color.IconosRedesSociales)
            )
            Texto(
                modifier = Modifier.padding(start = 15.dp, end = 55.dp),
                text = "Terms",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontSize = 20,
                textDecoration = TextDecoration.Underline,
                color = colorResource(R.color.IconosRedesSociales)
            )
            Texto(
                modifier = Modifier.padding(start = 15.dp),
                text = "Privacy",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontSize = 20,
                textDecoration = TextDecoration.Underline,
                color = colorResource(R.color.IconosRedesSociales)
            )
        }
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Texto(
                modifier = Modifier.padding(start = 15.dp, end = 45.dp, top = 15.dp, bottom = 70.dp),
                text = "Cookies",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontSize = 20,
                textDecoration = TextDecoration.Underline,
                color = colorResource(R.color.IconosRedesSociales)
            )
        }
    }
}