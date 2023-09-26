package Titanic.Modelo

import Titanic.Modelo.Enum.Zona

data class BoteSalvavida(private val id: Int,
                    private val numeroPlazas: Int,
                    private val zonaBarco: Zona
){

    //Dependiendo la zona en la que se encuentre el bote tendrán que acceder por determinadas escaleras. PASAR AL ENUM DE ZONA
    var escaleras = mutableListOf<Int>()

        init {
            escaleras += when(zonaBarco){

                Zona.PROA -> listOf<Int>(4, 9 ,24)


                Zona.POPA -> listOf<Int>(2,11,26)


                Zona.BABOR -> listOf<Int>(6,14,28)


                Zona.ESTRIBOR -> listOf<Int>(1,7,20)        }

        }

    fun getID():Int{
        return this.id
    }
    fun getNumPlazas():Int{
        return this.numeroPlazas
    }
    fun getZona():Zona{
        return this.zonaBarco
    }




    override fun toString(): String {
        return " Bote: $id \n Numero de plazas $numeroPlazas \n Zona: $zonaBarco \n Escaleras: $escaleras \n"
    }
}