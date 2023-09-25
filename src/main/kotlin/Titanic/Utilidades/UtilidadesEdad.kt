package Titanic.Utilidades

import Titanic.Enum.Edad
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

// Calcula la edad a partir de la fecha de nacimiento
fun calcularEdad(fechaNac: String): Int {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd") // Asume un formato de fecha "yyyy-MM-dd"
    val fechaNacimiento = LocalDate.parse(fechaNac, formatter)
    val fechaActual = LocalDate.now()
    val edad = Period.between(fechaNacimiento, fechaActual).years
    return edad
}

// Determina la edad
fun determinarCategoriaEdad(fechaNac: String): Edad {
    val edad = calcularEdad(fechaNac)

    return when {
        edad < 18 -> Edad.NIÑO
        edad >= 18 && edad < 65 -> Edad.ADULTO
        else -> Edad.ANCIANO
    }
}