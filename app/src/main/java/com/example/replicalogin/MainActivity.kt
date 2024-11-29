package com.example.replicalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.replicalogin.MVVM.ViewModel
import com.example.replicalogin.ui.theme.ReplicaLoginTheme

class MainActivity : ComponentActivity() {
    val viewModel = ViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReplicaLoginTheme {
                Scaffold {
                    innerPadding -> Login(viewModel, innerPadding)
                }
            }
        }
    }
}

