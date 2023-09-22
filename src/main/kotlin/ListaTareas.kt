class ListaTareas {

    private val lista = mutableListOf<Tarea>()


    fun getLista(): MutableList<Tarea>{
        return this.lista
    }
    fun agregarTarea(TareaNueva:Tarea):Boolean{
        lista.add(TareaNueva)
        return true
    }

    fun comprobarTareaEnLista(TareaABuscar:Tarea):Boolean{
        return TareaABuscar in lista
    }

    fun marcarTareaCompletada(TareaACompletar:Tarea):Boolean{
        if (comprobarTareaEnLista(TareaACompletar)){
            for (tarea in lista){
                if (tarea == TareaACompletar){
                    tarea.Completada = true
                    println("La tarea ${tarea.Titulo} está completada.")
                    return true
                }
            }
        }
        return false
    }

    fun buscarTareaACompletar(TituloTarea:String):Boolean{
        for (tarea in lista){
            return if (tarea.Titulo == TituloTarea){
                marcarTareaCompletada(tarea)
                true
            }else{
                println("Esa tarea no existe")
                false
            }
        }
        return false
    }

    fun mostrarTareas():MutableList<String>{
        val listadeTareas = mutableListOf<String>()
        for (tarea in lista){
            listadeTareas.add(tarea.toString())
        }
        return listadeTareas
    }

}