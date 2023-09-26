package Titanic.Modelo

import Titanic.Modelo.Enum.Zona

//DAOBotes es un objeto debido a que solo vamos a crear una instancia.
object DAOBotes {
    //Esta variable la vamos a utilizar para que los botes no tengan el mismo ID
    private var IDNumericoAuto = 1
    private val listaBotes = mutableListOf<BoteSalvavida>()

    init {
        //Cuando crea un bote se le suma uno al ID.
        val bote1 = BoteSalvavida(IDNumericoAuto++, 3, Zona.POPA)
        val bote2 = BoteSalvavida(IDNumericoAuto++, 2, Zona.PROA)
        val bote3 = BoteSalvavida(IDNumericoAuto++, 1, Zona.BABOR)
        val bote4 = BoteSalvavida(IDNumericoAuto++, 2, Zona.ESTRIBOR)

        //Agrega los botes a la lista.
        listaBotes.add(bote1)
        listaBotes.add(bote2)
        listaBotes.add(bote3)
        listaBotes.add(bote4)
    }

    fun obtenerListaBotes():MutableList<BoteSalvavida>{
        return listaBotes
    }

    fun obtenerBotesZona(ZonaBarco:Zona):MutableList<BoteSalvavida>{
        val botesZona = mutableListOf<BoteSalvavida>()
        for (bote in listaBotes){
            if (bote.getZona() == ZonaBarco){
                botesZona.add(bote)
            }
        }
        return botesZona
    }

    fun enseñarbote(){
        val listabotes = obtenerListaBotes()
            for (bote in listabotes){
                println(bote)
            }
    }
}