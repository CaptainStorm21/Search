package com.foundations.search.opening_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.foundations.search.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchDestination() {
    val backgroundImage: Painter = painterResource(R.drawable.paris_image2)
    val textState = remember { mutableStateOf(TextFieldValue()) }
    Box(
        modifier = Modifier.height(100.dp)
    ) {
        Image(
            painter = backgroundImage,
            contentDescription = "Background",
            modifier = Modifier.height(100.dp).fillMaxWidth(),
            contentScale = ContentScale.FillWidth, // This is used to scale and crop the image to fill the box
        )
        Row(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(horizontal = 16.dp, vertical=22.dp),
        ) {
           TextField(
               leadingIcon = { Icon(imageVector = Icons.Filled.Search, contentDescription = null) },
               modifier = Modifier.weight(1f).alpha(.8f).clip(RoundedCornerShape(6.dp)) ,
                value = textState.value,
                onValueChange = { textState.value = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                label = { Text("Search destination") }
            )

            Button(
                onClick = {}
            ) {
                Text("Go")
            }
        }
    }
}








