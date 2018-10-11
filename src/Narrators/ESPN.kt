package Narrators
import Narrador

class ESPN: Narrador{
    override fun narrar(evento: String):String {
        if (evento=="empieza el juego"){
            return "Empiezan 90 minutos del deporte mas hermozo del mundo"
        }
        else if (evento=="Un Kill"){

        }
    }
}