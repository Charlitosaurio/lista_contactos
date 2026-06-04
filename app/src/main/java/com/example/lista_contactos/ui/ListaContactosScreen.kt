package com.example.lista_contactos.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lista_contactos.models.Contacto

// IA generated: Main screen that displays a list of contacts using LazyColumn
@Composable
fun ListaContactosScreen(
    contactos: List<Contacto>,
    onContactoClick: (Contacto) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(contactos) { contacto ->
            ContactoItem(contacto = contacto, onClick = { onContactoClick(contacto) })
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}

// IA generated: Component to display a single contact item in the list
@Composable
fun ContactoItem(
    contacto: Contacto,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // IA generated: Avatar showing the contact's photo
        Image(
            painter = painterResource(id = contacto.fotoRes),
            contentDescription = "Foto de ${contacto.nombre}",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))

        // IA generated: Column for Name and Phone Number
        Column {
            Text(
                text = contacto.nombre,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 18.sp
            )
            Text(
                text = contacto.telefono,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary
            )
        }
    }
}
