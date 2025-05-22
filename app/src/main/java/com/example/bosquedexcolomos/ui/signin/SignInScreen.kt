package com.example.bosquedexcolomos.ui.signin

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bosquedexcolomos.R

@Composable
fun SignInScreen(modifier: Modifier = Modifier.fillMaxSize()) {
    Box(modifier =  modifier){
        Column {
            Box(Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .weight(2f))
            Column (
                modifier= Modifier
                    .fillMaxSize()
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ){

                Spacer(Modifier.weight(1f))

                Button(onClick = {}){ //TODO sign in lambda
                    Text(stringResource(R.string.signin_email_btn) )
                }

                Spacer(Modifier.weight(1f))
                Button(onClick = {}){ //TODO sign in lambda
                    Text(stringResource(R.string.signin_github_btn) )
                }
                Spacer(Modifier.weight(1f))

                Button(onClick = {}){ //TODO sign up lambda
                    Text(stringResource(R.string.signin_google_btn))
                }
                Spacer(Modifier.weight(1f))
            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SignInScreenPrev() {
    SignInScreen()
}