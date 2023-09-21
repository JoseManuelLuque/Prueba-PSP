interface Cliente {
    fun aplicaDescuento(producto: Producto): Int{
        return producto.obtenerDescuento()
    }

    fun pagar(cantidad:Double): Boolean{
        //TODO
        return true
    }
}