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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.historicalflashcard.ui.theme.HistoricalFlashcardTheme

class Review : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var score = intent.getIntExtra("score", -1)

        //Array for questions
        val questions = arrayOf("question 1-Mandela was the first president in South Africa?",
            "question 2-The ancient Egyptians built over 100 pyramids along the Nile River?",
            "question 3-Michelle Obama served as the First Lady of England from 2009 to 2017?",
            "question 4-World War I began in 1914 and ended in 1989?",
            "question 5-South Africa has never experienced Apartheid in the 1948?")

        //Array for answers
        val answers = arrayOf("True","False","False","True","False")

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Question 1")
                Text(text = questions[0])
                Text(text = "  " + answers[0])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "Question 2")
                Text(text = questions[1])
                Text(text = "  " + answers[1])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "Question 3")
                Text(text = questions[2])
                Text(text = "  " + answers[2])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "Question 4")
                Text(text = questions[3])
                Text(text = "  " + answers[3])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "Question 5")
                Text(text = questions[4])
                Text(text = "  " + answers[4])
                Spacer(modifier = Modifier.size(30.dp))

                Button(
                    onClick = {
                        //this button will terminate the app
                        finishAffinity()

                    }) {
                    Text(text = "Exit")

                }
            }


        }
    }
}

