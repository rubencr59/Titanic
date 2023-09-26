package Titanic.Controlador

import Titanic.Modelo.DAOPersonas
import Titanic.Modelo.Enum.Zona
import Titanic.Modelo.Asignacion
import Titanic.Modelo.DAOBotes

fun main(){

    val todasPersonas = DAOPersonas
    val todosBotes = DAOBotes
    val listaAsignacion = mutableListOf<Asignacion>()
    val listaPersonas = todasPersonas.obtenerListasPersonas()

    var minutos = 1

    val listaZonas = mutableListOf<Zona>()
    listaZonas.addAll(Zona.values().toList())


    while (listaPersonas.size != 0){
        for (zona in listaZonas){
            val listatempPersonas = todasPersonas.obtenerPersonasZona(zona) //Obtiene la lista de personas en una zona concreta.
            val listatempBotes = todosBotes.obtenerBotesZona(zona) //Obtiene la lista de botes en una zona concreta.

            val listaOrdenada = OrdenarLista(listatempPersonas)


            for (bote in listatempBotes){
                if (listaOrdenada.isNotEmpty()){
                    if(comprobarAsientos(comprobarPersonasBote(listaAsignacion,bote), bote)){

                        listaAsignacion.add(Asignacion(listaOrdenada[0], bote)) //Asigna persona a bote
                        println("${listaOrdenada[0].nombre_persona} ha sido asignado al bote ${bote.getID()}")
                        minutos += 1
                        listaPersonas.remove(listaOrdenada[0]) //Elimina la persona del barco.

                    }
                }
            }

        }
    }

    println(listaAsignacion)



}