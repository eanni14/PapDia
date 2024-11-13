package com.example.papdia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.papdia.ui.screen.Beranda
import com.example.papdia.ui.screen.DetailGambar
import com.example.papdia.ui.screen.EmptyScreen
import com.example.papdia.ui.theme.PapDiaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PapDiaTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "beranda_screen"
                    ) {

                        composable("beranda_screen") { Beranda(navController) }
                        composable("empty_screen") { EmptyScreen(navController) }

                        composable(
                            "detail_screen/{imageResId}/{description}",
                            arguments = listOf(
                                navArgument("imageResId") { type = NavType.IntType },
                                navArgument("description") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            val imageResId = backStackEntry.arguments?.getInt("imageResId") ?: R.drawable.karinadetail
                            val description = backStackEntry.arguments?.getString("description") ?: ""
                            DetailGambar(navController, imageResId, description)
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun EmptyScreen() {
    EmptyScreen()
}
