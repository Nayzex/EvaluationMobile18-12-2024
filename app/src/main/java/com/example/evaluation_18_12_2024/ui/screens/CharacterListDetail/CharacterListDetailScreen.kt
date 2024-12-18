package com.example.evaluation_18_12_2024.ui.screens.CharacterListDetail

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.evaluation_18_12_2024.R
import com.example.evaluation_18_12_2024.domain.models.Character

/**
 * Vue Composable qui affiche les détails d'un personnage.
 *
 * Si un personnage est trouvé, ses informations (nom, statut, espèce) sont affichées. Sinon, un message d'erreur est montré.
 *
 * @param character Le personnage à afficher dans la page de détails.
 */

@Composable
fun CharacterListDetailScreen(character: Character?) {
    if (character != null) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Text(text = stringResource(id = R.string.character_name) + " : ${character.name}")
            Text(text = stringResource(id = R.string.character_status) + " : ${character.status}")
            Text(text = stringResource(id = R.string.character_species) + " : ${character.species}")
        }
    } else {
        Text(text = stringResource(id = R.string.character_not_found))
    }
}

