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

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Animal
import com.example.androiddevchallenge.data.getAnimals
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun AnimalDetailScreen(navController: NavHostController, animalId: Int) {
    val animal = getAnimals().find { it.id == animalId }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = animal?.name ?: "Details") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        modifier = Modifier.clickable { navController.navigateUp() }
                    )
                }
            )
        },
        content = {
            animal?.apply {
                AnimalDetails(animal)
            }
        }
    )
}

@Composable
fun AnimalDetails(animal: Animal) {
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            Image(
                modifier = Modifier
                    .height(320.dp)
                    .fillMaxWidth(),
                painter = painterResource(id = animal.image),
                contentDescription = animal.name,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height((16.dp)))
            Text(
                text = animal.name,
                style = typography.h3,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height((16.dp)))
            Text(
                text = animal.breed,
                style = typography.body1,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            )
            Spacer(modifier = Modifier.height((16.dp)))
            Text(
                text = animal.gender,
                style = typography.body1,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            )
            Spacer(modifier = Modifier.height((16.dp)))
            Text(
                text = animal.description,
                style = typography.body2,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height((16.dp)))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { adoptAnimal(context, animal) },
                ) {
                    Text("Adopt ${animal.name} now")
                }
            }
            Spacer(modifier = Modifier.height((16.dp)))
        }
    }
}

fun adoptAnimal(context: Context, animal: Animal) {
    val intent = Intent(
        Intent.ACTION_VIEW,
        Uri.parse("https://adopt.spca.bc.ca/pets/${animal.id}")
    )
    if (intent.resolveActivity(context.packageManager) != null) {
        context.startActivity(intent)
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailsPreview() {
    MyTheme {
        AnimalDetailScreen(rememberNavController(), 162634)
    }
}
