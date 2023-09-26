package Titanic.Modelo

import Titanic.Controlador.determinarCategoriaEdad
import Titanic.Modelo.Enum.Edad
import Titanic.Modelo.Enum.Pais
import Titanic.Modelo.Enum.Zona


abstract class Persona(DNI:String, Pais: Pais, Zona: Zona, Nombre:String, Minusvalia: Boolean, FechaNac: String){

    //Atributos privados de persona.
    private var DNI_persona = DNI

    private var pais_persona = Pais

    private var zona_persona = Zona;

    //Atributos publicos de persona.
    var nombre_persona = Nombre;

    var minusvalia_persona = Minusvalia;

    var fechaNac_persona = FechaNac;

    var edadPersona:Edad = determinarCategoriaEdad(fechaNac_persona)




    //Métodos para la obtención de atributos privados.
    fun getDNi():String {
        return DNI_persona
    }

    fun getPais():Pais{
        return pais_persona
    }

    fun getZona():Zona{
        return zona_persona
    }

    override fun toString(): String {
        return " Nombre: $nombre_persona  \n Zona: $zona_persona  \n Edad: $edadPersona"
    }
}

