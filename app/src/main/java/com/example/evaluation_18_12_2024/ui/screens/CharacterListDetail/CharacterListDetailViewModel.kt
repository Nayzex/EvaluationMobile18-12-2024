package com.example.evaluation_18_12_2024.ui.screens.CharacterListDetail

import androidx.lifecycle.ViewModel
import com.example.evaluation_18_12_2024.data.repositories.CharacterRepository
import com.example.evaluation_18_12_2024.domain.models.Character

/**
 * ViewModel pour l'écran de détails du personnage.
 *
 * ViewModel qui récupère un personnage spécifique par son `characterId` en interagissant avec le `CharacterRepository`.
 *
 * @param characterId L'identifiant du personnage à récupérer.
 * @property character Le personnage à afficher dans l'écran de détail.
 */

class CharacterListDetailViewModel(private val characterId: Int) : ViewModel() {
    val character: Character? = CharacterRepository.getCharacterById(characterId)
}
