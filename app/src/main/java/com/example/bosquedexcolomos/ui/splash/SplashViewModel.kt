package com.example.bosquedexcolomos.ui.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bosquedexcolomos.data.AuthService
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashViewModel (private val authService: AuthService): ViewModel() {
    fun navigate( navigate:() -> Unit){
        viewModelScope.launch {
            delay(1000L)
            navigate()

        }
    }
    private fun isUserLogged(): Boolean {
        return authService.isUserLogged()
    return false
    }

    fun checkDestination(): SplashDestination {
        val isUserLogged = isUserLogged()
        if(isUserLogged){
            Log.i("BOSCLOG" ,"HOME")
            return SplashDestination.Home
        }else{
            Log.i("BOSCLOG" ,"LOGIN")

            return SplashDestination.Login
        }
    }

}


sealed class SplashDestination(){
    object Login: SplashDestination()
    object Home: SplashDestination()
}