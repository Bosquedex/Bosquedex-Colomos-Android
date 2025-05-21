package com.example.bosquedexcolomos.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.bosquedexcolomos.ui.log.LogViewModel
import com.example.bosquedexcolomos.ui.core.ContentWrapper
import com.example.bosquedexcolomos.ui.splash.SplashViewModel
import com.example.bosquedexcolomos.ui.theme.BosquedexColomosTheme
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.getValue

class MainActivity : ComponentActivity() {

    private lateinit var navigationController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val logViewModel : LogViewModel by viewModel()
        val splashViewModel : SplashViewModel by viewModel()

        enableEdgeToEdge()
        setContent {
            BosquedexColomosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    navigationController = rememberNavController()


                    ContentWrapper(

                        modifier = Modifier.padding(innerPadding),
                        navigationController = navigationController,
                        logViewModel = logViewModel,
                        splashViewModel = splashViewModel,
                        activity = this

//                        signUpViewModel = signUpViewModel,
    //                    detailsViewModel = detailsViewModel,
                    )


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BosquedexColomosTheme {
        Greeting("Android")
    }
}