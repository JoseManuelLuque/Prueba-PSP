class Pelicula(titulo:String, precio:Float, anio:Int, descuentoProducto:Int, genero: Genero_Pelicula, director:String): Producto(titulo, precio, anio, descuentoProducto) {
    protected var Genero = genero
    protected var Director = director

    init {
        Genero = genero
        Director = director
    }
}