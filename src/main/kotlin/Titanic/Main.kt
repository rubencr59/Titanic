package Titanic

import DAOPersonas
import Titanic.Enum.Zona

fun main(){

    val todasPersonas = DAOPersonas
    val todosBotes = DAOBotes
    val listaAsignacion = mutableListOf<Asignacion>()
    val listaPersonas = todasPersonas.obtenerListasPersonas()

    var minutos = 0

    val listaZonas = mutableListOf<Zona>()
    listaZonas.addAll(Zona.values().toList())

    while (listaPersonas.size != 0){
        minutos += 1
        for (zona in listaZonas){
            val listatempPersonas = todasPersonas.obtenerPersonasZona(zona) //Obtiene la lista de personas en una zona concreta.
            val listatempBotes = todosBotes.obtenerBotesZona(zona) //Obtiene la lista de botes en una zona concreta.

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

                Zona.BABOR ->{

                }
                Zona.ESTRIBOR ->{

                }

            }
        }
    }

}