package com.example.evaluation_18_12_2024.ui.screens.CharacterList

import androidx.lifecycle.ViewModel
import com.example.evaluation_18_12_2024.data.repositories.CharacterRepository
import com.example.evaluation_18_12_2024.domain.models.Character

/**
 * ViewModel pour l'écran de liste des personnages.
 *
 * Responsable de fournir les données nécessaires à l'affichage des personnages, récupérées via le `CharacterRepository`.
 *
 * ViewModel conçu pour être utilisé dans l'écran `CharacterListScreen`.
 *
 * @property characters Liste des personnages à afficher.
 */

class CharacterListViewModel : ViewModel() {
    val characters: List<Character> = CharacterRepository.getCharacters()
}
