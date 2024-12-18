package com.example.evaluation_18_12_2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.evaluation_18_12_2024.navigation.AppNavGraph
import com.example.evaluation_18_12_2024.ui.theme.Evaluation18122024Theme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness4
import androidx.compose.material.icons.filled.Brightness7
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var isDarkTheme by remember { mutableStateOf(false) }

            val toggleTheme = { isDarkTheme = !isDarkTheme }

            val themeColors = if (isDarkTheme) darkColorScheme() else lightColorScheme()

            Evaluation18122024Theme(isDarkTheme = isDarkTheme) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(stringResource(id = R.string.app_name)) },
                            actions = {
                                IconButton(onClick = toggleTheme) {
                                    // Changer l'icône en fonction du thème
                                    Icon(
                                        imageVector = if (isDarkTheme) Icons.Filled.Brightness7 else Icons.Filled.Brightness4,
                                        contentDescription = stringResource(id = R.string.change_theme)
                                    )
                                }
                            }
                        )
                    },
                    content = { innerPadding ->
                        AppNavGraph(
                            navController = rememberNavController(),
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                )

            }
        }
    }
}
