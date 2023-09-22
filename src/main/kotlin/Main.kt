import ListaTareas
import Tarea

fun main() {


    val listadeTareas1 = ListaTareas()

    val tarea1 = Tarea("Regar el cesped", "Debo regar el cesped del jardín a las ocho", "Fácil")
    val tarea2 = Tarea("Limpiar mi habitacion", "Limpiar el polvo, barrer y fregar el suelo", "Medio")

    listadeTareas1.agregarTarea(tarea1)
    listadeTareas1.agregarTarea(tarea2)

    print(listadeTareas1.mostrarTareas())

    println("¿Que tarea quieres completar?")
    var tareaAcompletar = readln().toString()

    if(listadeTareas1.buscarTareaACompletar(tareaAcompletar)){
        println("Tarea '$tareaAcompletar' completada.")
    }else{
        println("La tarea no existe o no se ha podido completar.")
    }

    print(listadeTareas1.mostrarTareas())

}