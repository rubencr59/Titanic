package Titanic.Modelo

import Titanic.Modelo.Enum.NivelResponsabilidad
import Titanic.Modelo.Enum.Pais
import Titanic.Modelo.Enum.Zona


class Tripulacion(DNI:String, Pais: Pais, Zona: Zona, Nombre:String, Minusvalia: Boolean, FechaNac: String, NivelResponsabilidad: NivelResponsabilidad): Persona(DNI, Pais, Zona, Nombre, Minusvalia, FechaNac){

    var nivelResp = NivelResponsabilidad
}