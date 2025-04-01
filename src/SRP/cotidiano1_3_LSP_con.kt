package SRP


interface Figura {
    fun calcularArea(): Int
}


class Cuadrado(var lado: Int) : Figura {
    override fun calcularArea(): Int {
        return lado * lado
    }
}


class Rectangulos(var base: Int, var altura: Int) : Figura {
    override fun calcularArea(): Int {
        return base * altura
    }
}

fun main() {
    val cuadrado: Figura = Cuadrado(5)
    println("Área del cuadrado: ${cuadrado.calcularArea()}")

    val rectangulos: Figura = Rectangulos(5, 10)
    println("Área del rectángulo: ${rectangulos.calcularArea()}")
}