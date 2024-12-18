package com.example.evaluation_18_12_2024.ui.utils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import androidx.core.app.ActivityCompat
//import com.google.android.gms.location.FusedLocationProviderClient
//import com.google.android.gms.location.LocationServices
//import kotlinx.coroutines.tasks.await

//object LocationUtils {

//    private var fusedLocationClient: FusedLocationProviderClient? = null

//    fun getCurrentLocation(context: Context): Location? {
//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)

//        // Vérifie les permissions avant de récupérer la localisation
//        if (ActivityCompat.checkSelfPermission(
//                context,
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED &&
//            ActivityCompat.checkSelfPermission(
//                context,
//                Manifest.permission.ACCESS_COARSE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            return null // Permissions manquantes
//        }

//        val location = fusedLocationClient?.lastLocation?.await()
//        return location
//    }
//}
