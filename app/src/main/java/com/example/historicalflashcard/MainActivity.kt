package com.example.historicalflashcard

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.historicalflashcard.ui.theme.HistoricalFlashcardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Flashcards Pazzels",
                    modifier = Modifier,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold

                )

                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "press a button to begin the pazzels")
                Spacer(modifier = Modifier.size(30.dp))

                Button(
                    onClick = {
                        //Run when  button clicked
                        val next = Intent(this@MainActivity, Flashcards::class.java)
                        startActivity(next)

                    })

                {

                    Text(text = "Start")

                }


            }


        }
    }
}


