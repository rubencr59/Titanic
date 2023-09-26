package Titanic.Modelo

import Titanic.Modelo.Enum.Pais
import Titanic.Modelo.Enum.Zona

class Pasajero(DNI:String, Pais: Pais, Zona: Zona, Nombre:String, Minusvalia: Boolean, FechaNac: String, NumHabitacion: Int): Persona(DNI, Pais, Zona, Nombre, Minusvalia, FechaNac) {

    private val numerodehabitacion = NumHabitacion

    fun getNumHabitacion(): Int{
        return this.numerodehabitacion
    }
}