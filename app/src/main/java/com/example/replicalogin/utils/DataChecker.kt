package com.example.replicalogin.utils

object DataChecker {

    const val USUARIO_PRUEBA = "Usuario"
    const val PASSWORD_PRUEBA = "Usuario"


    fun checkData(usernameOrEmail: String?, password: String?): Error? {

        var errorCode = 0

        if (usernameOrEmail == "" || usernameOrEmail == null){
            errorCode = 1
        }
        if (password == "" || password == null){
            errorCode = 2
        }
        if ((usernameOrEmail == "" || usernameOrEmail == null) && (password == "" || password == null)){
            errorCode = 3
        }


        when (errorCode){
            0 -> { return null }
            1 -> { return  Error("Missing Username") }
            2 -> { return  Error("Missing Password") }
            else -> { return  Error("No Data") }
        }
    }

}