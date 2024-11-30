package com.example.replicalogin.MVVM

import androidx.lifecycle.LiveData
import com.example.replicalogin.utils.Error

interface IViewModel {

    val usernameOrEmail: LiveData<String>?

    val password: LiveData<String>?

    val visible: LiveData<Boolean>?

    val errorList: LiveData<MutableList<Error?>>?

    val errors: LiveData<Boolean>?

    val validLogin : LiveData<Boolean>?


    fun onUsernameOrEmailChange( usernameOrEmail: String )

    fun onPasswordChange( password: String)

    fun onVisibleChange( visible: Boolean )

    fun onButtonPressed()

    fun setValidLogin()

}