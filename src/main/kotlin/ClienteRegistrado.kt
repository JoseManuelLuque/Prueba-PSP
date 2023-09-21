class ClienteRegistrado(nombre:String, apellidos:String, dni_nif:String, telefono:String, saldo:Float, descuento:Int) {
    private var Nombre = nombre
    private var Apellidos = apellidos
    private var DNI_NIF = dni_nif
    private var Telefono = telefono
    private var Saldo = saldo
    private var Descuento = 2

    init {
        Nombre = nombre
        Apellidos = apellidos
        DNI_NIF = dni_nif
        Telefono = telefono
        Saldo = saldo
        Descuento = descuento
    }

    fun validarDNI(): Boolean{
        //TODO
        return true
    }

    fun esVIP(): Boolean{
        //TODO
        return false
    }

    private fun actualizaDescuento(): Unit{
        //TODO
        return Unit
    }
}