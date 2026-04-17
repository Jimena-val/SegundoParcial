package com.example.segundoparcial.navegacion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ReportView(navegante: NavHostController) {

    var nombre by remember { mutableStateOf("") }
    var apellido by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Para Acceder, debe llenar los campos")
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Captura de datos")

        Button(
            onClick = {
                navegante.popBackStack()
            }
        ) {
            Text(text = "Regresar")
        }

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        )

        TextField(
            value = apellido,
            onValueChange = { apellido = it },
            label = { Text("Apellido") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        )

        TextField(
            value = edad,
            onValueChange = { edad = it },
            label = { Text("Edad") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        )

        Button(
            onClick = {
                navegante.navigate(
                    ReportModel(
                        nombre = nombre.trim(),
                        apellido = apellido.trim(),
                        edad = edad.toInt()
                    )
                )
            }
        ) {
            Text(text = "Enviar datos")
        }
    }
}