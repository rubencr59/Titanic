data class Tarea(val Titulo:String, val Descripcion:String, val Dificultad:String){
    var Completada:Boolean = false

    override fun toString(): String {
        return "Titulo: $Titulo \n Descripcion: $Descripcion \n Dificultad: $Dificultad \n Estado: $Completada \n"
    }
}