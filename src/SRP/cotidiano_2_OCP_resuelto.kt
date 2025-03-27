package SRP


interface Grafica {
    fun dibujar()
}


class GraficaBarras : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de barras")
    }
}


class GraficaLineas : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de líneas")
    }
}


class GestorGraficas {
    fun dibujarGrafica(grafica: Grafica) {
        grafica.dibujar()
    }
}

fun main() {
    val gestor = GestorGraficas()


    val graficaBarras = GraficaBarras()
    val graficaLineas = GraficaLineas()


    gestor.dibujarGrafica(graficaBarras)
    gestor.dibujarGrafica(graficaLineas)

}








