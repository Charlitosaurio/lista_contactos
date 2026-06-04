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
        Contacto("Eladio", "555-0101", R.drawable.eladio),
        Contacto("Raphina", "555-0102", R.drawable.raphina),
        Contacto("Dembele", "555-0103", R.drawable.dembele),
        Contacto("Cristiano", "555-0104", R.drawable.cristiano),
        Contacto("Alison", "555-0105", R.drawable.alison),
        Contacto("Jamal", "555-0106", R.drawable.yamal),
        Contacto("Neymar", "555-0107", R.drawable.neymar),
        Contacto("Victor", "555-0108", R.drawable.victor),
        // IA generated: Local contact using the provided image resource
        Contacto("Angel Malagon", "4774487035", R.drawable.angel_malagon)
    )
}
