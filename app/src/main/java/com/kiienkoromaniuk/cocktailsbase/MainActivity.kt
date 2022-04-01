package com.kiienkoromaniuk.cocktailsbase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            Surface {
                NavHost(navController = navController, startDestination = "splash") {

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