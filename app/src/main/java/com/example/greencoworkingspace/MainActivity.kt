package com.example.greencoworkingspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greencoworkingspace.screens.Dashbord
import com.example.greencoworkingspace.screens.RoomSelect
import com.example.greencoworkingspace.screens.StartScreen
import com.example.greencoworkingspace.ui.theme.GreenCoWorkingSpaceTheme


enum class AppScreen() {
    Initial,
    Dashbord,
    RoomSelect
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreenCoWorkingSpaceTheme {
                MainPage()
            }
        }
    }
}



@Composable
fun MainPage() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreen.Initial.name,
    ) {
        composable(route = AppScreen.Initial.name) {
            StartScreen(navController)
        }

        composable(route = AppScreen.Dashbord.name) {
            Dashbord(navController)
        }

        composable(route = AppScreen.RoomSelect.name) {
            RoomSelect(navController)
        }
    }


}