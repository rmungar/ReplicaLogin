package com.example.replicalogin.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.replicalogin.R

@Composable
fun CampoDeTexto(
    texto: String,
    visualTransformation: VisualTransformation,
    trailingIcon: Boolean,
    visible: Boolean,
    onTextoChange: (String) -> Unit,
    onVisibleChange : (Boolean) -> Unit
){

    OutlinedTextField(
        value = texto,
        onValueChange = {
            onTextoChange(it)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 5.dp,
                start = 5.dp,
                end = 5.dp,
            )
        ,
        placeholder = {
            Text(
                text = "Required",
                color = Color.Gray
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedBorderColor = colorResource(R.color.ColorTextFields),
            unfocusedBorderColor = Color.Gray
        ),
        singleLine = true,
        visualTransformation =
            if (visible) {
             VisualTransformation.None
            }
            else{
                visualTransformation
            }
        ,
        trailingIcon = {
            if (trailingIcon){
                if (!visible){
                    Icon(
                        painter = painterResource(R.drawable.visibility_24dp_0000000_fill0_wght400_grad0_opsz24),
                        contentDescription = "View Password",
                        modifier = Modifier
                            .clickable {
                                onVisibleChange(visible)
                            }
                            .size(30.dp),

                    )
                }
                else{
                    Icon(
                        painter = painterResource(R.drawable.visibility_off_24dp_0000000_fill0_wght400_grad0_opsz24),
                        contentDescription = "View Password",
                        modifier = Modifier
                            .clickable {
                                onVisibleChange(visible)
                            }
                            .size(30.dp)
                    )
                }

            }
        }
    )
}