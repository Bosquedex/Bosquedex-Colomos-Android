package com.example.bosquedexcolomos.ui.core

import android.app.Activity
import android.util.Log
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.bosquedexcolomos.ui.log.LogViewModel
import com.example.bosquedexcolomos.ui.splash.SplashScreen
import com.example.bosquedexcolomos.ui.splash.SplashViewModel
import kotlinx.serialization.Serializable
import androidx.navigation.compose.composable
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.bosquedexcolomos.ui.log.LogScreen





@Composable
fun ContentWrapper(
    navigationController: NavHostController,
    modifier: Modifier,
    logViewModel: LogViewModel,
    splashViewModel: SplashViewModel,
    activity: Activity
) {
    NavHost(
        modifier = modifier,
        navController = navigationController,
        startDestination = Routes.SplashScreen
    ) {
        composable<Routes.SplashScreen> {
            SplashScreen(
                modifier = modifier,
                splashViewModel = splashViewModel,
                onNavigateToLogin = {
                    navigationController.navigate(route = Routes.LogScreen) {
                        popUpTo(route = Routes.SplashScreen) { inclusive = true }
                    }
                    Log.i("KADSLOG", "loginS")
                },
                onNavigateToHome = {
                    navigationController.navigate(route = Routes.LogScreen) {
                        popUpTo(route = Routes.SplashScreen) { inclusive = true }
                    }
                }
            )
        }
        composable <Routes.LogScreen> {
            LogScreen(
               // modifier = modifier,
               // loginViewModel = loginViewModel,
               // onNavigateToDetail = {
               //     navigationController.navigate(Routes.DetailsScreen){
               //         popUpTo(Routes.LoginScreen){ inclusive = true }
               //     }
               // },
               // onNavigateToSignUp = {navigationController.navigate(Routes.SignUpScreen)},

                //onNavigateToLoginWithPhone={navigationController.navigate(Routes.LoginWithPhoneScreen)},
                //activity = activity,
            )
        }



    }
}

sealed class Routes{
    @Serializable
    data object SplashScreen: Routes()

    @Serializable
    data object LogScreen: Routes()

//    @Serializable
//    data object LoginWithPhoneScreen: Routes()

//    @Serializable
//    data object SignUpScreen: Routes()

//    @Serializable
//    data object DetailsScreen: Routes()

}
