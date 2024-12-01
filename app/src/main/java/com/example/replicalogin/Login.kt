package com.example.replicalogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.asFlow
import com.example.replicalogin.MVVM.ViewModel
import com.example.replicalogin.body.LoginCreateForgot
import com.example.replicalogin.body.OtherLogins
import com.example.replicalogin.componentes.CampoDeTexto
import com.example.replicalogin.componentes.ErrorDeCampo
import com.example.replicalogin.componentes.LoginValido
import com.example.replicalogin.componentes.Separadores
import com.example.replicalogin.componentes.Texto
import com.example.replicalogin.footer.Footer


/**
 * Función Composable que genera una pantalla de inicio de sesión con diversos componentes de interfaz de usuario
 * y gestión de estados a través de un ViewModel.
 *
 * @param viewModel Instancia del ViewModel que maneja el estado del formulario de inicio de sesión.
 * @param paddingValues Valores de padding aplicados al contenedor principal de la pantalla de inicio de sesión.
 */
@Composable
fun Login(viewModel: ViewModel, paddingValues: PaddingValues) {
    val usernameOrEmail = viewModel.usernameOrEmail.asFlow().collectAsState("")
    val password = viewModel.password.asFlow().collectAsState("")
    val visible = viewModel.visible.asFlow().collectAsState(false)
    val errors = viewModel.errors.asFlow().collectAsState(false)
    val errorList = viewModel.errorList.asFlow().collectAsState(emptyList())
    val validLogin = viewModel.validLogin.asFlow().collectAsState(false)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.Fondo))
            .padding(paddingValues)
            .verticalScroll(state = rememberScrollState(0)),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(R.color.FondoColumna))
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(50.dp)
                    .padding(top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logoitchio),
                    contentDescription = null,
                    alignment = Alignment.Center
                )
            }
            Separadores(1)
            Texto(
                modifier = Modifier.padding(top = 30.dp, start = 5.dp, bottom = 30.dp),
                color = colorResource(R.color.ColorTextoTitulos),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                fontSize = 23,
                text = stringResource(R.string.itch_IoLogin),
                textDecoration = TextDecoration.None
            )
            Separadores(1)

            if (errors.value) {
                ErrorDeCampo(errorList.value)
            } else {
                if (validLogin.value) {
                    LoginValido()
                }
            }

            Texto(
                modifier = Modifier.padding(top = 30.dp, start = 5.dp),
                color = colorResource(R.color.ColorTextoTitulos),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                fontSize = 21,
                text = "Username or email",
                textDecoration = TextDecoration.None
            )
            CampoDeTexto(
                usernameOrEmail.value,
                VisualTransformation.None,
                false,
                visible.value,
                { viewModel.onUsernameOrEmailChange(it) }
            ) {}

            Texto(
                modifier = Modifier.padding(top = 30.dp, start = 5.dp),
                color = colorResource(R.color.ColorTextoTitulos),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                fontSize = 21,
                text = "Password",
                textDecoration = TextDecoration.None
            )
            CampoDeTexto(
                password.value,
                PasswordVisualTransformation(),
                true,
                visible.value,
                { viewModel.onPasswordChange(it) }
            ) {
                viewModel.onVisibleChange(it)
            }

            LoginCreateForgot {
                viewModel.onButtonPressed()
            }

            Separadores(1)

            Texto(
                modifier = Modifier.padding(top = 30.dp, start = 5.dp, bottom = 15.dp),
                color = colorResource(R.color.ColorTextoTitulos),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                fontSize = 19,
                text = "Or log in with another site",
                textDecoration = TextDecoration.None
            )
            OtherLogins()

            Separadores(1)

            Texto(
                modifier = Modifier.padding(start = 5.dp, top = 10.dp, bottom = 10.dp),
                color = Color.DarkGray,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal,
                fontSize = 17,
                text = "Looking for something you bought?",
                textDecoration = TextDecoration.Underline
            )
        }
        Footer()
    }
}
