package com.example.evaluation_18_12_2024.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.evaluation_18_12_2024.data.repositories.CharacterRepository
import com.example.evaluation_18_12_2024.ui.screens.CharacterList.CharacterListScreen
import com.example.evaluation_18_12_2024.ui.screens.CharacterListDetail.CharacterListDetailScreen

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "characterList",
        modifier = modifier
    ) {
        composable("characterList") {
            CharacterListScreen(navController)
        }

        composable(
            "characterDetail/{characterId}",
            arguments = listOf(navArgument("characterId") { type = NavType.IntType })
        ) { backStackEntry ->
            val characterId = backStackEntry.arguments?.getInt("characterId")
            val character = CharacterRepository.getCharacterById(characterId ?: 0)
            CharacterListDetailScreen(character)
        }
    }
}
