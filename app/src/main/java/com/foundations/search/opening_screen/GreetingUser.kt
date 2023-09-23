package com.foundations.search.opening_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GreetingUser() {
    val isLoggedIn = false

    Column(){
    Row(
        modifier = Modifier.height(20.dp).fillMaxWidth(1f).padding(horizontal=5.dp)
        ){
       // if a user is not logged in we add Trekker if a user is logged in user their fullname
        Text(text = "Greetings, ",
            style = MaterialTheme.typography.bodyLarge,
            )
        if(isLoggedIn==true){
        Text(text = "fullName",
            style = MaterialTheme.typography.bodyLarge,
        )}
        if(isLoggedIn==false){
            Text(text = "Trekker",
                style = MaterialTheme.typography.bodyLarge,
            )}
        Text(text = "!",
            style = MaterialTheme.typography.bodyLarge,
        )
    }
        if(isLoggedIn==false) {
            Row(modifier = Modifier.padding(horizontal = 5.dp, vertical = 10.dp).fillMaxWidth(1f)) {
                Text(
                    text = "Welcome! Feel Free to ",
                    style = MaterialTheme.typography.bodySmall,
                )
                Text(
                    text = "Sign In ",
                    style = MaterialTheme.typography.bodySmall,
                )
                Text(
                    text = "or ",
                    style = MaterialTheme.typography.bodySmall,
                )
                Text(
                    text = "SignUp Free!",
                    style = MaterialTheme.typography.bodySmall,
                )
            }
        }
}
}