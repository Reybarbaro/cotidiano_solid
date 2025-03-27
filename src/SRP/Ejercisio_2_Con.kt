package SRP

class Clientes(val nombre: String, val edad: Int)

class GestorClientes {
    fun guardarCliente(cliente: Cliente) {
        println("Guardando cliente ${cliente.nombre} en la base de datos...")
    }
}

class ServicioCorreo {
    fun enviarCorreo(cliente: Cliente) {
        println("Enviando correo a ${cliente.nombre}...")
    }
}

fun main() {
    val cliente = Cliente("Carlos", 28)


    val gestorClientes = GestorClientes()
    val servicioCorreo = ServicioCorreo()


    gestorClientes.guardarCliente(cliente)


    servicioCorreo.enviarCorreo(cliente)
}