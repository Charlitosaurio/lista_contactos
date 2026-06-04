package com.example.lista_contactos.models

import com.example.lista_contactos.R

// IA generated: Data class to represent a contact with name, phone and photo resource
data class Contacto(
    val nombre: String,
    val telefono: String,
    val fotoRes: Int
)

// IA generated: List of sample contacts to populate the UI
fun getContactosDeMuestra(): List<Contacto> {
    return listOf(
        Contacto("Juan Perez", "555-0101", android.R.drawable.ic_menu_myplaces),
        Contacto("Maria Garcia", "555-0102", android.R.drawable.ic_menu_myplaces),
        Contacto("Luis Rodriguez", "555-0103", android.R.drawable.ic_menu_myplaces),
        Contacto("Ana Martinez", "555-0104", android.R.drawable.ic_menu_myplaces),
        Contacto("Carlos Lopez", "555-0105", android.R.drawable.ic_menu_myplaces),
        Contacto("Elena Gomez", "555-0106", android.R.drawable.ic_menu_myplaces),
        Contacto("Pedro Sanchez", "555-0107", android.R.drawable.ic_menu_myplaces),
        Contacto("Lucia Fernandez", "555-0108", android.R.drawable.ic_menu_myplaces),
        // IA generated: Local contact using the provided image resource
        Contacto("Angel Malagon", "4774487035", R.drawable.angel_malagon)
    )
}
