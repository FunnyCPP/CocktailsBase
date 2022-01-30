package com.kiienkoromaniuk.cocktailsbase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.kiienkoromaniuk.cocktailsbase.screens.splash.SplashScreen
import com.kiienkoromaniuk.cocktailsbase.ui.themes.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isDarkModeValue = true // isSystemInDarkTheme()

            val currentStyle = remember { mutableStateOf(CocktailslStyle.Purple) }
            val currentFontSize = remember { mutableStateOf(CocktailsSize.Medium) }
            val currentPaddingSize = remember { mutableStateOf(CocktailsSize.Medium) }
            val currentCornersStyle = remember { mutableStateOf(CocktailsCorners.Rounded) }
            val isDarkMode = remember { mutableStateOf(isDarkModeValue) }

            MainTheme(
                style = currentStyle.value,
                darkTheme = isDarkMode.value,
                textSize = currentFontSize.value,
                corners = currentCornersStyle.value,
                paddingSize = currentPaddingSize.value
            ) {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()

                // Set status bar color
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = if (isDarkMode.value) baseDarkPalette.primaryBackground else baseLightPalette.primaryBackground,
                        darkIcons = !isDarkMode.value
                    )
                }

                Surface {
                    NavHost(navController = navController, startDestination = "splash") {
                        composable("splash") {
                            SplashScreen(navController = navController)
                        }

                        composable("main") {
                            /* val settings = SettingsBundle(
                                 isDarkMode = isDarkMode.value,
                                 style = currentStyle.value,
                                 textSize = currentFontSize.value,
                                 cornerStyle = currentCornersStyle.value,
                                 paddingSize = currentPaddingSize.value
                             )*/

                            /*MainScreen(navController = navController,
                                settings = settings, onSettingsChanged = {
                                    isDarkMode.value = it.isDarkMode
                                    currentStyle.value = it.style
                                    currentFontSize.value = it.textSize
                                    currentCornersStyle.value = it.cornerStyle
                                    currentPaddingSize.value = it.paddingSize
                                }
                            )*/
                        }

                        composable("compose") {
                            /*val composeViewModel = hiltViewModel<ComposeViewModel>()
                            ComposeScreen(navController = navController, composeViewModel = composeViewModel)*/
                        }
                    }
                }
            }
        }
    }
}