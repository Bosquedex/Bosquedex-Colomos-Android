package com.example.bosquedexcolomos.ui.splash

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen(
    modifier: Modifier,
    splashViewModel: SplashViewModel,
    onNavigateToLogin : () -> Unit,
    onNavigateToHome : () -> Unit

){
    LaunchedEffect(true) {
        Log.i("KADSLOG" ,"A")
        when(splashViewModel.checkDestination()){
            SplashDestination.Home -> onNavigateToHome()
            SplashDestination.Login -> splashViewModel.navigate { onNavigateToLogin()
                Log.i("KADSLOG" ,"B")

            }

        }
    }

    Box(

        modifier = modifier
            //.background(color = Splash)
            .background(color = Color.Cyan)
            .fillMaxSize(),

    ){

        Log.i("KADSLOG" ,"C")

        Text(
            text = "Firebase",
            modifier
                .align(Alignment.Center),
            fontSize = 30.sp
        )

    }

}


private fun navigateToLogin(onNavigateToLogin: () -> Unit){
        onNavigateToLogin()
}
//
//@Preview
//@Composable
//private fun PrevSplashScreen() {
//    SplashScreen(Modifier, onNavigateToLogin = {})
//}