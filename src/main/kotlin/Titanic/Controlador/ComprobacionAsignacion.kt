package Titanic.Controlador

import Titanic.Modelo.Asignacion
import Titanic.Modelo.BoteSalvavida



//Comprueba cuantas personas estan asignadas a un bote.
fun comprobarPersonasBote(ListaAsignacion:MutableList<Asignacion>, BoteAComprobar: BoteSalvavida):Int{

    var numeroPersonas:Int = 0

    for (asignacion in ListaAsignacion){
        if (asignacion.bote == BoteAComprobar){
            numeroPersonas ++
        }
    }

    return numeroPersonas
}


//Comprueba si hay asientos disponibles en el bote.
fun comprobarAsientos(PersonasEnBote:Int, BoteAComprobar:BoteSalvavida):Boolean{

    //Comprueba si hay espacio en el bote.
    return PersonasEnBote < BoteAComprobar.getNumPlazas()

}