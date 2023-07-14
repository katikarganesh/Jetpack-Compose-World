package com.example.composesamples.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun WelcomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to\nJetpack Compose World",
            fontSize = 24.sp,
            textAlign=TextAlign.Center,
            modifier = Modifier.fillMaxWidth().wrapContentHeight().align(alignment = Alignment.CenterHorizontally))
    }

}