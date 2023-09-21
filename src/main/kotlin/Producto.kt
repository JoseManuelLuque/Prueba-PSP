abstract class Producto(titulo:String, precio:Float, anio:Int, descuentoProducto:Int) {
    protected var titulo = ""

    protected var precio = 0.0

    protected var anio = 0

    init {
        this.titulo = titulo
        this.precio = precio
        this.anio = anio

    }

    fun obtenerDescuento(): Int {
        //TODO
    }


}