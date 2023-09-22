class Coche(
    //Atributos del Coche
    private val matricula: String,
    val marca: String,
    val modelo: String,
    val año: Int,
    var color: String,
    val precio: Double
) {
    //Función para obtener la matrícula
    fun getMatricula():String{
        return this.matricula
    }

    //Función para comprar el coche
    fun comprarCoche(Dinero:Double):Boolean{
        val dineroRestante = this.precio - Dinero
        if(dineroRestante == 0.0){
            println("Coche comprado")
            return true
        }else if(dineroRestante > 0.0){
            println("Coche no comprado, falta dinero")
            return false
        }else{
            println("Has introducido más dinero de el necesario.")
            return false
        }
    }

    //Función para cambiar el color del coche.
    fun cambioColor(ColorNuevo:String):Boolean{
        this.color = ColorNuevo
        return true
    }
}