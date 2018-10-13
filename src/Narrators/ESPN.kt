package Narrators
import Narrador

class ESPN: Narrador{
    override fun narrar(evento: String):String {
        if(evento=="bienvenida"){
            return "Bienvenidos damas y caballeros a una nueva edicion de ESPN, Andres Agulla junto al matador Mario Alberto Kempes, que partido que nos espera"
        }
        else if (evento=="empieza el juego"){
            return "Empiezan 90 minutos del deporte mas hermozo del mundo"
        }
        else if (evento=="Un Kill radiant"){

        }
        return "No esta pasando nada señores"
    }
}