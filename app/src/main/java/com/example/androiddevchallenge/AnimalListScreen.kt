/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.Animal
import com.example.androiddevchallenge.data.getAnimals
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun AnimalListScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Adopt BC") })
        },
        content = {
            AnimalList()
        }

    )
}

@Composable
fun AnimalList() {
    LazyColumn {
        items(getAnimals()) { animal ->
            AnimalListItem(animal = animal)
            // TODO animal click
        }
    }
}

@Composable
fun AnimalListItem(animal: Animal) {
    Card(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                modifier = Modifier.size(96.dp, 96.dp),
                painter = painterResource(id = animal.image),
                contentDescription = animal.name,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            ) {

                Text(
                    text = animal.name,
                    style = typography.body1,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height((16.dp)))
                Text(
                    text = animal.breed,
                    style = typography.body2
                )
                Spacer(modifier = Modifier.height((16.dp)))
                Text(
                    text = animal.gender,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun ListPreview() {
    MyTheme {
        AnimalList()
    }
}
