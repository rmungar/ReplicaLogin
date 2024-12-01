package com.example.replicalogin.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.replicalogin.utils.Error
import com.example.replicalogin.utils.DataChecker

/**
 * Implementación de un ViewModel que maneja el estado y la lógica del formulario de inicio de sesión.
 * Esta clase proporciona datos observables y métodos para interactuar con el formulario de la UI.
 *
 * Propiedades:
 * - `usernameOrEmail`: Observa el nombre de usuario o correo electrónico ingresado.
 * - `password`: Observa la contraseña ingresada.
 * - `visible`: Controla la visibilidad de la contraseña.
 * - `errorList`: Lista de errores relacionados con el formulario.
 * - `errors`: Indica si hay errores en el formulario.
 * - `validLogin`: Indica si el inicio de sesión es válido.
 *
 * Métodos:
 * - `onUsernameOrEmailChange`: Actualiza el nombre de usuario o correo electrónico.
 * - `onPasswordChange`: Actualiza la contraseña.
 * - `onVisibleChange`: Alterna la visibilidad de la contraseña.
 * - `onButtonPressed`: Realiza la validación del formulario y actualiza estados.
 * - `setValidLogin`: Determina si el inicio de sesión es válido.
 */
class ViewModel: IViewModel {


    private val _usernameOrEmail = MutableLiveData<String>()
    override val usernameOrEmail: LiveData<String> = _usernameOrEmail

    private val _password = MutableLiveData<String>()
    override val password: LiveData<String> = _password

    private val _visible = MutableLiveData<Boolean>()
    override val visible: LiveData<Boolean> = _visible

    private val _errorList = MutableLiveData<MutableList<Error?>>()
    override val errorList: LiveData<MutableList<Error?>> = _errorList

    private val _errors = MutableLiveData<Boolean>()
    override val errors: LiveData<Boolean> = _errors

    private val _validLogin = MutableLiveData<Boolean>()
    override val validLogin: LiveData<Boolean> = _validLogin

    override fun onUsernameOrEmailChange(usernameOrEmail: String) {
        _usernameOrEmail.value = usernameOrEmail
    }

    override fun onPasswordChange(password: String) {
        _password.value = password
    }

    override fun onVisibleChange(visible:Boolean) {
        _visible.value = !visible
    }

    override fun onButtonPressed() {
        _errorList.value = mutableListOf()
        val currentError = DataChecker.checkData(_usernameOrEmail.value, _password.value)
        _errorList.value!!.add(currentError)
        if (!_errorList.value!!.contains(null) && _errorList.value!!.isNotEmpty()) _errors.value = true
        else _errors.value = false
        setValidLogin()
    }

    override fun setValidLogin() {
        _validLogin.value = _errors.value?.not()
    }
}