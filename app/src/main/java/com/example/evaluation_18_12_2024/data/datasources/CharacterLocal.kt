package com.example.evaluation_18_12_2024.data.datasources

import com.example.evaluation_18_12_2024.domain.models.Character

/**
 * données locale simulée pour les personnages du jeu.
 * liste mutable de personnages fictifs.
 *
 * Liste est utilisée pour récupérer des données sur les personnages sans interaction avec une base de données réelle.
 *
 * @property characters Liste mutable de personnages avec des informations de base (id, nom, statut, espèce).
 */

object CharacterLocal {
    val characters: MutableList<Character> = mutableListOf(
        Character(1, "Doe", "Directeur", "Humain"),
        Character(2, "Smith", "Boss", "Humain"),
        Character(3, "Johnson", "AYIII", "Humain"),
        Character(4, "Williams", "Alice", "Humain")
    )
}
