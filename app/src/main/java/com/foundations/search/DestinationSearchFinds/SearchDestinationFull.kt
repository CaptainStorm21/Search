package com.foundations.search.DestinationSearchFinds

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.filled.Search
import com.foundations.search.R


@Composable
fun SearchDestinationFull(){
    val backgroundImage: Painter = painterResource(R.drawable.search_bg_image)
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
                onClick = { },
                leadingIcon = { Icon(imageVector = Icons.Filled.Search, contentDescription = null) },
                modifier = Modifier.weight(1f).alpha(.8f).clip(RoundedCornerShape(6.dp)) ,
                value = textState.value,
                onValueChange = { textState.value = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                label = { Text("Search Destination") }
            )
        }
    }
}
