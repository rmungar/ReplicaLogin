package com.example.replicalogin.footer

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.replicalogin.R

@Composable
fun RedesSociales(){
    Row (
        Modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            painter = painterResource(
                R.drawable.z3bn6deaxmrjmqhnekpcze_removebg_preview),
            contentDescription = null,
            tint = colorResource(R.color.IconosRedesSociales),
            modifier = Modifier.size(50.dp)
        )
        Icon(
            painter = painterResource(
                R.drawable.pixelcut_export_removebg_preview),
            contentDescription = null,
            tint = colorResource(R.color.IconosRedesSociales),
            modifier = Modifier.size(40.dp),
        )
    }
}