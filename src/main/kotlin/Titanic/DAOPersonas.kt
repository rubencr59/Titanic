import Titanic.*
import Titanic.Enum.NivelResponsabilidad
import Titanic.Enum.Pais
import Titanic.Enum.Zona

//DAOPersonas es un objeto debido a que solo vamos a crear una instancia.

object DAOPersonas {
    private val listapersonas = mutableListOf<Persona>()

    init {
        val pasajero1 = Pasajero("33632925W", Pais.ESPAÑA, Zona.BABOR, "Antonio", false, "20/08/2003", 32)
        val pasajero2 = Pasajero("77699138D", Pais.ALEMANIA, Zona.ESTRIBOR, "Maria", true, "30/06/1994", 32)
        val Tripulante1 = Tripulacion("18473283M", Pais.FRANCIA, Zona.POPA, "Pedro", false, "03/04/1970", NivelResponsabilidad.BAJA)
        val Tripulante2 = Tripulacion("81013196C", Pais.ITALIA, Zona.PROA, "Isabel", false, "24/04/2004", NivelResponsabilidad.MUY_BAJA)
        val Capitan = Tripulacion("66481204A", Pais.PORTUGAL, Zona.POPA, "Agustin", false, "30/09/2015", NivelResponsabilidad.CAPITAN)
        listapersonas.add(pasajero1)
        listapersonas.add(pasajero2)
        listapersonas.add(Tripulante1)
        listapersonas.add(Tripulante2)
        listapersonas.add(Capitan)
    }

    fun obtenerListasPersonas():MutableList<Persona>{
        return listapersonas
    }

    fun obtenerPersonasZona(ZonaBarco:Zona):MutableList<Persona>{
        val personasenZona = mutableListOf<Persona>()
        for (persona in listapersonas){
            if (persona.getZona() == ZonaBarco){
                personasenZona.add(persona)
            }
        }
        return personasenZona
    }

    fun obtenerPersonasPopa():MutableList<Persona>{
        val personasPopa = mutableListOf<Persona>()
        for (persona in listapersonas){
            if (persona.getZona() == Zona.POPA){
                personasPopa.add(persona)
            }
        }
        return personasPopa
    }

    fun obtenerPersonasBabor():MutableList<Persona>{
        val personasBabor = mutableListOf<Persona>()
        for (persona in listapersonas){
            if (persona.getZona() == Zona.BABOR){
                personasBabor.add(persona)
            }
        }
        return personasBabor
    }

    fun obtenerPersonasEstribor():MutableList<Persona>{
        val personasEstribor = mutableListOf<Persona>()
        for (persona in listapersonas){
            if (persona.getZona() == Zona.ESTRIBOR){
                personasEstribor.add(persona)
            }
        }
        return personasEstribor
    }
}
