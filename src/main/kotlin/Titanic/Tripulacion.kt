package Titanic

import Titanic.Enum.NivelResponsabilidad
import Titanic.Enum.Pais
import Titanic.Enum.Zona


class Tripulacion(DNI:String, Pais: Pais, Zona: Zona, Nombre:String, Minusvalia: Boolean, FechaNac: String, NivelResponsabilidad: NivelResponsabilidad): Persona(DNI, Pais, Zona, Nombre, Minusvalia, FechaNac){

    var nivelResp = NivelResponsabilidad
}