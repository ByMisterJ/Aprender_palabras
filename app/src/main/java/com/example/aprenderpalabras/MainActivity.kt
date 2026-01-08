package com.example.aprenderpalabras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aprenderpalabras.ui.navigation.AppNavigation
import com.example.aprenderpalabras.ui.theme.AprenderPalabrasTheme
import com.example.aprenderpalabras.viewmodel.SettingsViewModel
import com.example.aprenderpalabras.viewmodel.SettingsViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            val settingsViewModel: SettingsViewModel = viewModel(
                factory = SettingsViewModelFactory(applicationContext)
            )
            
            val isDarkMode by settingsViewModel.isDarkMode.collectAsState()
            
            AprenderPalabrasTheme(darkTheme = isDarkMode) {
                AppNavigation(settingsViewModel = settingsViewModel)
            }
        }
    }
}
