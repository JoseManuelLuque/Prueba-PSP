class Disco(titulo:String, precio:Double, anio:Int, descuentoProducto:Int, genero: Genero_Musica, grupo:String, stock:Int): Producto(titulo, precio, anio, descuentoProducto) {
    protected var Genero = genero
    protected var Grupo = grupo
    protected var Stock = stock

    init {
        Genero = genero
        Grupo = grupo
        Stock = stock
    }


}