package com.example.nombreynocontrol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.nombreynocontrol.ui.theme.NombreyNoControlTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NombreyNoControlTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android", clase = "Desarrollo android",
//                        modifier = Modifier.padding(innerPadding)

//                    )
                    Surface (
                        modifier = Modifier.fillMaxSize().padding(innerPadding),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        GreetingText(
                            message = "Jesus Muñoz",
                            from = "22130835",
                            modifier = Modifier.padding()
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, clase:String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier,
            fontSize = 50.sp
        )
        Text(
            text = "Jose Luis",
            fontSize = 30.sp
        )

        Text(
            text = "Descripcion de Android",
            fontSize = 30.sp
        )

        Text(
            text = "$clase",
            fontSize = 30.sp
        )
    }
    Column {
        Text(text = "Hola Mundo")
        Text(text = "Expresion en Content")

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NombreyNoControlTheme {
        Greeting("Android", "Desarrollo android")
    }
}

@Composable
fun GreetingText(message: String, from:String, modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize() 
    ) {
        Text(
            text = message,
            fontSize = 110.sp,
            lineHeight = 120.sp,
            color = androidx.compose.ui.graphics.Color.Green
        )
        Text(
            text = from,
            fontSize = 30.sp
        )
    }
}