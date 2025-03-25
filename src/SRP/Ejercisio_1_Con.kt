package SRP

class Producto(val nombre: String, val precio: Double) {
    fun calcularDescuento(porcentaje: Double): Double {
        return precio - (precio * porcentaje / 100)
    }
    class ImpresoraProductos{
        fun imprimirDetalles(producto: Producto){
            println("producto: ${producto.nombre},Precio: ${producto.precio}")
        }
    }

}
class GestorProductos {
    private val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun mostrarProductos() {
        productos.forEach {
            println("Producto: ${it.nombre}, Precio: ${it.precio}")
        }
    }
}

fun main() {
  val producto = Producto("Laptop", 1500.0)
    val impresora = Producto.ImpresoraProductos()

    println("precio con edscuentos: ${producto.calcularDescuento(10.0)}")

    impresora.imprimirDetalles(producto)
}