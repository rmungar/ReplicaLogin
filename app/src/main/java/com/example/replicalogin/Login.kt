package com.example.replicalogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Login(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.Fondo))
    ){

        Column(
            modifier = Modifier.fillMaxWidth()
        )
        {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(50.dp)
                    .padding(top = 5.dp, bottom = 5.dp)
            ) {
                Image(painter = painterResource(R.drawable.logoitchio), contentDescription = null, alignment = Alignment.Center)
            }
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(colorResource(R.color.Separadores))
            )
            Text(
                modifier = Modifier
                    .padding(top = 30.dp, start = 5.dp, bottom = 30.dp),
                text = stringResource(R.string.itch_IoLogin),
                fontWeight = FontWeight.Bold,
                fontSize = 23.sp,
                color = colorResource(R.color.ColorTextoTitulos)
            )
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(colorResource(R.color.Separadores))
            )
        }
    }


}