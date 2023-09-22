package Titanic

import DAOPersonas
import Titanic.Enum.Zona

fun main(){

    val todasPersonas = DAOPersonas
    val todosBotes = DAOBotes
    val listaAsignacion = mutableListOf<Asignacion>()

    var minutos = 0

    var listaZonas = mutableListOf<Zona>()
    listaZonas.addAll(Zona.values().toList())

    while (minutos != todasPersonas.obtenerListasPersonas().size){
        minutos += 1
        for (zona in listaZonas){
            var listatempPersonas = todasPersonas.obtenerPersonasZona(zona) //Obtiene la lista de personas en una zona concreta.
            var listatempBotes = todosBotes.obtenerBotesZona(zona) //Obtiene la lista de botes en una zona concreta.
            when(zona){
                Zona.PROA ->{
                    if(listatempPersonas.isNotEmpty()){
                        for (persona in listatempPersonas) {
                            for (bote in listatempBotes) {
                                val asignacionPersonaABote = Asignacion(persona,bote)
                                if (asignacionPersonaABote !in listaAsignacion){
                                    listaAsignacion.add(asignacionPersonaABote)
                                }
                                break
                            }
                            break
                        }
                    }
                }
                Zona.POPA ->{

                }

                else -> {}
            }
        }


    }
    println(listaAsignacion)

}