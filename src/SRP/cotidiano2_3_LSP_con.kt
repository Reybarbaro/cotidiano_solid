package SRP


interface Dispositivos {
    fun encender()
}


class Televisors : Dispositivos {
    override fun encender() {
        println("Encendiendo televisor...")
    }
}


class Radios : Dispositivos {
    override fun encender() {
        println("La radio no se puede encender de esta manera. Por favor, use el control remoto.")
    }
}

fun main() {
    val dispositivoTelevisor: Dispositivo = Televisor()
    dispositivoTelevisor.encender()
    val dispositivoRadio: Dispositivo = Radio()
    dispositivoRadio.encender()
}