package com.example.lista_contactos.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.lista_contactos.models.getContactosDeMuestra
import com.example.lista_contactos.ui.DetalleContactoScreen
import com.example.lista_contactos.ui.ListaContactosScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "lista",
        modifier = modifier
    ) {
        composable("lista") {
            ListaContactosScreen(
                contactos = getContactosDeMuestra(),
                onContactoClick = { contacto ->
                    navController.navigate("detalle/${contacto.nombre}/${contacto.telefono}/${contacto.fotoRes}")
                }
            )
        }
        composable(
            route = "detalle/{nombre}/{telefono}/{fotoRes}",
            arguments = listOf(
                navArgument("nombre") { type = NavType.StringType },
                navArgument("telefono") { type = NavType.StringType },
                navArgument("fotoRes") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            // Obtención de argumentos desde el NavBackStackEntry
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            val telefono = backStackEntry.arguments?.getString("telefono") ?: ""
            val fotoRes = backStackEntry.arguments?.getInt("fotoRes") ?: 0
            
            DetalleContactoScreen(
                nombre = nombre,
                telefono = telefono,
                fotoRes = fotoRes,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
