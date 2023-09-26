package Titanic.Controlador

import Titanic.Modelo.Enum.Edad
import Titanic.Modelo.Persona

fun OrdenarLista(ListaPersonas:MutableList<Persona>): List<Persona>{

    val personasOrdenadas = ListaPersonas.sortedWith(compareBy(
        { it.edadPersona },
        { it.minusvalia_persona },
        { it.nombre_persona }
    ))

    return personasOrdenadas
}