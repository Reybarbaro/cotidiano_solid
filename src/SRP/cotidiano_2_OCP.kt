package SRP

class Graficas {
    fun dibujar(tipo: String) {
        when (tipo) {
            "barra" -> println("Dibujando gráfica de barras")
            "linea" -> println("Dibujando gráfica de líneas")
            else -> println("Tipo de gráfica no soportado")
        }
    }
}
fun main() {
    val grafica = Graficas()
    grafica.dibujar("barra")
    grafica.dibujar("linea")
}