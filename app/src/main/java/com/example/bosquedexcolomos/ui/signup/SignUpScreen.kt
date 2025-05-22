package com.example.bosquedexcolomos.ui.signup

import android.widget.ImageButton
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bosquedexcolomos.R

@Composable
fun SignUpScreen(modifier: Modifier = Modifier.fillMaxSize()) {
    Box(modifier =  modifier){
        Column {
            Box(Modifier.fillMaxSize().background(color = Color.Red).weight(2f))
            Column (
                modifier= Modifier.fillMaxSize().weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Spacer(Modifier.weight(1f))

                Button(onClick = {}){ //TODO sign up lambda
                    Text(stringResource(R.string.signup_phone_btn) )
                }

                Spacer(Modifier.weight(1f))

                Button(onClick = {}){ //TODO sign up lambda
                    Text(stringResource(R.string.signup_email_btn) )
                }

                Spacer(Modifier.weight(1f))

                Button(onClick = {}){ //TODO sign up lambda
                    Text(stringResource(R.string.signup_github_btn) )
                }

                Spacer(Modifier.weight(1f))

                Button(onClick = {}){ //TODO sign up lambda
                    Text(stringResource(R.string.signup_google_btn))
                }
                Spacer(Modifier.weight(2f))
            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SignUpScreenPrev() {
    SignUpScreen()
}