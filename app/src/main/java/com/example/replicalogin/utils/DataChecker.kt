package com.example.replicalogin.utils

import com.example.replicalogin.MVVM.ViewModel

/**
 * Objeto que valida los datos de inicio de sesión ingresados por el usuario.
 *
 * Propiedades:
 * - `USUARIO_PRUEBA`: Nombre de usuario válido para las pruebas.
 * - `PASSWORD_PRUEBA`: Contraseña válida para las pruebas.
 *
 * Métodos:
 * - `checkData`: Valida los datos de entrada (nombre de usuario o correo y contraseña).
 *   Devuelve un objeto `Error` con un mensaje específico si los datos no son válidos,
 *   o `null` si los datos son correctos.
 */
object DataChecker {

    const val USUARIO_PRUEBA = "Usuario"
    const val PASSWORD_PRUEBA = "Usuario"

    private val viewModel = ViewModel()


    fun checkData(usernameOrEmail: String?, password: String?): Error? {

        var errorCode = 0


        if ((usernameOrEmail == "" || usernameOrEmail == null) || (password == "" || password == null)){
            if (usernameOrEmail == "" || usernameOrEmail == null){
                errorCode += 1
            }
            if (password == "" || password == null){
                errorCode += 2
            }
        }
        else{
            if(usernameOrEmail != USUARIO_PRUEBA || password != PASSWORD_PRUEBA){
                errorCode = 4
            }
        }


        when (errorCode){
            1 -> { return  Error("Missing Username") }
            2 -> { return  Error("Missing Password") }
            3 -> { return Error("No Data") }
            4 -> { return Error("Invalid Username or Password")}
            else -> {
                viewModel.setValidLogin()
                return null
            }
        }
    }

}