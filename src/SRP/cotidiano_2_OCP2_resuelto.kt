package SRP


interface Envio {
    fun enviar(archivo: String)
}


class EnvioFtp : Envio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}


class EnvioHttp : Envio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}


class GestorEnvios {
    fun enviarArchivo(envio: Envio, archivo: String) {
        envio.enviar(archivo)
    }
}

fun main() {
    val gestor = GestorEnvios()
    gestor.enviarArchivo(EnvioFtp(), "documento.txt")
    gestor.enviarArchivo(EnvioHttp(), "imagen.png")
}
