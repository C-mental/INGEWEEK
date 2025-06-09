package com.example.sem07.ui.ubicaciones

data class Ubicacion(
    val nombre: String,
    val direccion: String,
    val tipo: String,            // 👈 Agregado
    val imagenResId: Int
)
