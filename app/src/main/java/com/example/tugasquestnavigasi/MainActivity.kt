package com.example.tugasquestnavigasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugasquestnavigasi.ui.theme.TugasQuestNavigasiTheme
import androidx.activity.compose.setContent
import com.example.tugasquestnavigasi.ui.theme.TugasQuestNavigasiTheme
import com.example.tugasquestnavigasi.view.FormInput
import com.example.tugasquestnavigasi.view.TampilanData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasQuestNavigasiTheme {
                NavigationApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasQuestNavigasiTheme {
        Greeting("Android")
    }
}