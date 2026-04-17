package com.example.segundoparcial.navegacion

import com.example.segundoparcial.R


data class Categoria(
    val nombre: String,
    val imagen: Int
)
data class Producto(
    val nombre: String,
    val precio: String,
    val imagen: Int,
    val categoria: String
)

val categorias = listOf(
    Categoria("Originals", R.drawable.originals),

    Categoria("Calzado", R.drawable.calzado),
    Categoria("Accesorios", R.drawable.accesorios),
    Categoria("Deportes", R.drawable.deportes),
    Categoria("Bolsos", R.drawable.bolsos)
)

val productos = listOf(
    Producto("Top Deportivo Power Soporte Ligero", "$999", R.drawable.img1, categoria = "Originals"),
    Producto("Bolero PrimeLift Essentials Workout Contour", "$649", R.drawable.img2, categoria = "Originals"),
    Producto("Mallas Optimé 7/8 Estampado de Leopardo", "$1,799", R.drawable.img3, categoria = "Originals"),
    Producto("Audífonos Bluetooth", "$499", R.drawable.img4, categoria = "Originals"),
    Producto("Playera adi365 Cheering", "$999", R.drawable.img6, categoria = "Originals"),
    Producto("TENIS SAMBA OG", "$2,499", R.drawable.claz1, categoria = "Calzado"),
    Producto("TENIS PARA CANCHA CUBIERTA GAZELLE", "$2,499", R.drawable.calz2, categoria = "Calzado"),
    Producto("tenis Forum2000", "$2,499", R.drawable.calz3, categoria = "Calzado"),
    Producto(nombre = "Tenis Adizero EVO SL", precio = "$3,599", imagen = R.drawable.calz4, categoria = "Calzado"),
    Producto(nombre = "TENIS ADISTAR CONTROL 5", precio = "$2,799", imagen = R.drawable.calz5, categoria = "Calzado"),
    Producto(nombre = "guantes de arquero Copa Pro", precio = "$1,225", imagen = R.drawable.acc1, categoria = "Accesorios"),
    Producto(nombre = "Gorra Tour Five-Panel", precio = "$699", imagen = R.drawable.acc2, categoria = "Accesorios"),
    Producto(nombre = "CALCETINES A MEDIA PANTORRILLA SPORTSWEAR 3 FRANJAS ACOLCHADAS, PAQUETE DE 3 PARES", precio = "$339", imagen = R.drawable.acc3, categoria = "Accesorios"),
    Producto(nombre = "Balón Trionda Club Copa Mundial de la FIFA 26™", precio = "$649", imagen = R.drawable.acc4, categoria = "Accesorios"),
    Producto(nombre = "Balón Trionda Pro Copa Mundial de la FIFA 26™ de Fútbol Playa", precio = "$1,299", imagen = R.drawable.acc5, categoria = "Accesorios"),
    Producto(nombre = "Tenis Adizero EVO SL", precio = "$3,599", imagen = R.drawable.dep1, categoria = "Deportes"),
    Producto(nombre = "Jersey Visitante Selección Argentina 26 Versión Jugador", precio = "$2,999", imagen = R.drawable.dep2, categoria = "Deportes"),
    Producto(nombre = "BOLSA PARA COSMÉTICOS adidas DEFENDER", precio = "$349", imagen = R.drawable.dep3, categoria = "Deportes"),
    Producto(nombre = "CHAMARRA DEPORTIVA MERCEDES - AMG PETRONAS F1 TEAM SILVER ARROWS ICON PARA HOMBRE", precio = "$2,799", imagen = R.drawable.dep4, categoria = "Deportes"),
    Producto(nombre = "Falda Club para tennis Climacool", precio = "$999", imagen = R.drawable.dep5, categoria = "Deportes"),
    Producto(nombre = "BOLSA FESTIVAL CON CUENTAS", precio = "$799", imagen = R.drawable.bols1, categoria = "Bolsos"),
    Producto(nombre = "MINIBOLSA BOWLING ADICOLOR DENIM", precio = "$799", imagen = R.drawable.bols2, categoria = "Bolsos"),
    Producto(nombre = "BOLSA PARA OBJETOS PEQUEÑOS", precio = "$599", imagen = R.drawable.bols3, categoria = "Bolsos"),
    Producto(nombre = "BOLSA AIRLINER ALARGADA", precio = "$999", imagen = R.drawable.bols4, categoria = "Bolsos"),
    Producto(nombre = "BOLSA ADICOLOR XS", precio = "$899", imagen = R.drawable.bols5, categoria = "Bolsos")
)