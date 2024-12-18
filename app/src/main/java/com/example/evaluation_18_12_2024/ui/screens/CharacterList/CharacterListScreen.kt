package com.example.evaluation_18_12_2024.ui.screens.CharacterList

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.evaluation_18_12_2024.R
import com.example.evaluation_18_12_2024.domain.models.Character
import android.content.Context
import android.os.VibrationEffect
import android.os.Vibrator
import android.media.SoundPool
import android.media.AudioAttributes
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

/**
 * VuecComposable affiche la liste des personnages dans un `LazyColumn` avec des informations de base.
 *
 * Lorsqu'un élément de la liste est cliqué, l'application navigue vers une page de détails pour ce personnage.
 *
 * @param navController Contrôleur de navigation pour gérer la navigation entre les écrans.
 */

@Composable
fun CharacterListScreen(navController: NavController) {
    val viewModel = CharacterListViewModel()
    val context = LocalContext.current
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(viewModel.characters) { character ->
            CharacterBox(character, navController, context)
        }
    }
}

@Composable
fun CharacterBox(character: Character, navController: NavController, context: Context) {
    val soundPool = remember {
        SoundPool.Builder()
            .setMaxStreams(1)
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
            ).build()
    }

    val soundId = soundPool.load(context, R.raw.click_sound, 1)

    fun triggerVibration() {
        val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (vibrator.hasVibrator()) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                val vibrationEffect = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE) // 100 ms de vibration
                vibrator.vibrate(vibrationEffect)
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(100)
            }
        }
    }

    fun playSound() {
        soundPool.play(soundId, 1f, 1f, 0, 0, 1f)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = {
            triggerVibration()
            playSound()
            navController.navigate("characterDetail/${character.id}")
        },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Column {
                Text(text = stringResource(id = R.string.character_name) + " : ${character.name}", color = MaterialTheme.colorScheme.onSurface)
                Text(text = stringResource(id = R.string.character_status) + " : ${character.status}", color = MaterialTheme.colorScheme.onSurface)
                Text(text = stringResource(id = R.string.character_species) + " : ${character.species}", color = MaterialTheme.colorScheme.onSurface)
            }
        }
    }
}

