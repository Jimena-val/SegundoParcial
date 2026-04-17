package com.example.segundoparcial.navegacion


import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Inicio

@Serializable
object Reporte

@Serializable
data class ReportModel(val nombre: String, val edad: Int, val apellido: String)
@Composable

fun NavManager (){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = Inicio, modifier = Modifier.padding()){
        composable<Inicio> {
            InicioView(navController)
        }
        composable<com.example.segundoparcial.navegacion.Reporte> {
            ReportView(navController)
        }
        composable<com.example.segundoparcial.navegacion.ReportModel> {
            val datos : com.example.segundoparcial.navegacion.ReportModel = it.toRoute()
            PDF(datos)
        }
    }
}