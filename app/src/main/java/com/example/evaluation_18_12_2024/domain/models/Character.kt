package com.example.evaluation_18_12_2024.domain.models

/**
 * Définit le modèle de données pour un `Character`.
 *
 * Modèle est utilisé pour représenter un personnage dans l'application.
 *
 * @param id Identifiant du personnage.
 * @param name Nom du personnage.
 * @param status Statut du personnage.
 * @param species Espèce du personnage.
 */

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String
)
