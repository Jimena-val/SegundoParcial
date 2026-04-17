package com.example.segundoparcial.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable

fun PDF(generarreporte : ReportModel = ReportModel(edad = 23, nombre = "Jimena", apellido = "Valencia")){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text= "Apellido: ${generarreporte.apellido}")
        Text(text = "Nombre: ${generarreporte.nombre}")
        Text(text= "Edad: ${generarreporte.edad}")
    }
}

@Preview(showBackground = true)
@Composable
fun PDFPreview(){
    val reporte = ReportModel(edad = 23, nombre = "Jimena", apellido = "Valencia")
    PDF(generarreporte = reporte)
}