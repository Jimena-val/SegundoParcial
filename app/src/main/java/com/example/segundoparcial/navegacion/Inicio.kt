package com.example.segundoparcial.navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun InicioView(navegante: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Pantalla principal",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.5.sp
            )
        LazyColumn {
            item {
                Text(
                    text = "Categorías",
                    modifier = Modifier.padding(16.dp)
                )
            }
            item {
                LazyRow(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(categorias) { categoria ->
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .clickable {
                                    navegante.navigate(Reporte)
                                },
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = categoria.imagen),
                                contentDescription = categoria.nombre,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(CircleShape)
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(text = categoria.nombre)
                        }
                    }
                }
            }
            item {
                Text(
                    text = "Todos los productos",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(16.dp)
                )
            }

            items(productos) { producto ->
                ProductoCard(producto)
            }
        }
    }
}