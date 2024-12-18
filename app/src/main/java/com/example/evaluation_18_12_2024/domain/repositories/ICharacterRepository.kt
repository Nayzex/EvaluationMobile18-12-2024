package com.example.evaluation_18_12_2024.domain.repositories

import com.example.evaluation_18_12_2024.domain.models.Character

/**
 * Interface définissant les méthodes pour interagir avec les données des personnages.
 *
 * Interface qui impose que les classes qui l'implémentent fournissent des méthodes pour récupérer tous les personnages et un personnage spécifique par son id.
 *
 * @see CharacterRepository pour l'implémentation concrète.
 */

interface ICharacterRepository {
    fun getCharacters(): List<Character>
    fun getCharacterById(id: Int): Character?
}
