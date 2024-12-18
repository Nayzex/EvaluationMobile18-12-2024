package com.example.evaluation_18_12_2024.data.repositories

import com.example.evaluation_18_12_2024.data.datasources.CharacterLocal
import com.example.evaluation_18_12_2024.domain.models.Character

/**
 * Gère l'accès aux données des personnages via la source locale.
 *
 * Expose deux fonctions principales :
 * - `getCharacters()` pour récupérer tous les personnages.
 * - `getCharacterById(id: Int)` pour récupérer un personnage spécifique en fonction de son id.
 *
 * Agit comme un intermédiaire entre les sources de données et l'UI.
 *
 * @see CharacterLocal pour la source de données des personnages.
 */

object CharacterRepository {
    fun getCharacters(): List<Character> = CharacterLocal.characters
    fun getCharacterById(id: Int): Character? = CharacterLocal.characters.find { it.id == id }
}
