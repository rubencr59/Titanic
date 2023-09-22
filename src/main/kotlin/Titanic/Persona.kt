package Titanic

import Titanic.Enum.Pais
import Titanic.Enum.Zona


abstract class Persona(DNI:String, Pais: Pais, Zona: Zona, Nombre:String, Minusvalia: Boolean, FechaNac: String){

    //Atributos privados de persona.
    private var DNI_persona = DNI

    private var pais_persona = Pais

    private var zona_persona = Zona;

    //Atributos publicos de persona.
    var nombre_persona = Nombre;

    var minusvalia_persona = Minusvalia;

    var fechaNac_persona = FechaNac;


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

}

