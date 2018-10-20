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
        else if (evento=="1 kill radiant"){
            return "Un kill mas para radiant y dire se tiene que empezar a preocupar"
        }
        else if (evento=="1 kill dire"){
            return "Un kill mas para dire y radiant se tiene que empezar a preocupar"
        }
        else if (evento=="2 kill radiant"){
            return "Mas kills para radiant y asi de rapido cambian las cosas"
        }
        else if (evento=="2 kills dire"){
            return "Mas kills para dire y este partido se mira un poco mas complicado para radiant"
        }
        else if (evento=="5 kills radiant"){
            return "5 kills mas para radiant y colorin colorado creo que este cuento se ha acabado"
        }
        else if (evento=="5 kills dire"){
            return "5 kills mas para dire, parece que solo hay un equipo en la cancha"
        }
        else if (evento=="Torre radiant"){
            return "Una torre menos para dire"
        }
        else if (evento=="Torre dire"){
            return "Una torre menos para radiant"
        }
        else if (evento=="gana radiant"){
            return "Se acabo el partido señores fue un placer acompañarlos junto al matador Mario Alberto Kempez una victoria para radiant nos vemos a la proxima"
        }
        else if (evento=="gana dire") {
            return "Se acabo el partido señores fue un placer acompañarlos junto al matador Mario Alberto Kempez una victoria para dire nos vemos a la proxima"
        }
        return "No esta pasando nada señores"
    }
}