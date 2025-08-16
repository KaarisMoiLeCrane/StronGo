package com.kmlc.strongo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kmlc.strongo.navigation.StronGoNavGraph
import com.kmlc.strongo.ui.theme.StronGoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StronGoTheme {
                StronGoNavGraph()
            }
        }
    }
}
