abstract class Producto(titulo:String, precio:Double, anio:Int, descuentoProducto:Int) {
    protected var Titulo = titulo

    protected var Precio = precio

    protected var Anio = anio

    protected var Descuento = 0

    init {
        Titulo = titulo
        Precio = precio
        Anio = anio
        Descuento = descuentoProducto
    }

    fun obtenerDescuento(): Int {
        return Descuento
    }


}