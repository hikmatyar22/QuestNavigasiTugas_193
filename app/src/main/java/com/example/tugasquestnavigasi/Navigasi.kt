package com.example.tugasquestnavigasi

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasquestnavigasi.view.FormInput
import com.example.tugasquestnavigasi.view.TampilanBeranda
import com.example.tugasquestnavigasi.view.TampilanData

enum class Screen {
    Home,
    DaftarData,
    FormInput
}

@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.name) {
        composable(Screen.Home.name) {
            TampilanBeranda(
                onNavigateToForm = {
                    navController.navigate(Screen.DaftarData.name)
                }
            )
        }

        composable(Screen.DaftarData.name) {
            TampilanData(
                OnBerandaClick = {
                    navController.navigate(Screen.Home.name) {
                        popUpTo(Screen.Home.name) { inclusive = true }
                    }
                },
                OnFormulirClick = {
                    navController.navigate(Screen.FormInput.name)
                }
            )
        }


        composable(Screen.FormInput.name) {
            FormInput(
                OnBackBtnClick = {
                    navController.navigate(Screen.DaftarData.name) {
                        popUpTo(Screen.DaftarData.name) { inclusive = true }
                    }
                },
                OnSubmitBtnClick = {
                }
            )
        }
    }
}