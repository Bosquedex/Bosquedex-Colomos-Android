package com.example.bosquedexcolomos.ui.log

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bosquedexcolomos.R

@Composable
fun LogScreen() {
    Box(modifier =  Modifier.fillMaxSize()){
        Column(verticalArrangement = Arrangement.Top) {
            Image(
                painter = painterResource(R.drawable.log_image),
                contentDescription = stringResource(R.string.log_image_cd),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
            )
            Spacer(modifier = Modifier.weight(1f))

        }

        Column(
            modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(Modifier.weight(20f))
            Text(
                text = "Hello",
                modifier = Modifier
            )
            Button(onClick = {}){ //TODO sign in lambda
                Text(stringResource(R.string.log_signin_btn) )
            }
            Spacer(Modifier.weight(1f))

            Button(onClick = {}){ //TODO sign up lambda
                Text(stringResource(R.string.log_signup_btn))
            }
            Spacer(Modifier.weight(2f))

        }
    }

}

@Preview(showBackground = true, showSystemUi = true, name = "COMPLETE")
@Composable
private fun LogScreenPreview() {
    LogScreen()
}