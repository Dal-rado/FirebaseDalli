package com.example.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebase.ui.theme.screens.home.HomeScreen
import com.example.firebase.ui.theme.screens.login.LoginScreen
import com.example.firebase.ui.theme.screens.products.AddProductsScreen
import com.example.firebase.ui.theme.screens.products.UpdateProductsScreen
import com.example.firebase.ui.theme.screens.products.ViewProductsScreen
import com.example.firebase.ui.theme.screens.products.ViewUploadsScreen
import com.example.firebase.ui.theme.screens.registration.RegisterScreen
import com.example.firebase.ui.theme.screens.splash.Splash

@Composable
fun AppNavHost(modifier: Modifier =Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
        composable(ROUTE_SPLASH) {
            Splash(navController)
        }
    }

}