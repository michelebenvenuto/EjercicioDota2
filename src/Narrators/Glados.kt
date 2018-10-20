package Narrators
import Narrador
class Glados: Narrador{
    override fun narrar(evento: String): String {
        if(evento=="bienvenida"){
            return "Well, look who's come crawling back. "
        }
        else if (evento=="empieza el juego"){
            return "Nobody'd think less of you if you abandoned, by the way"
        }
        else if (evento=="1 kill radiant"){
            return "You should be in prison."
        }
        else if (evento=="1 kill dire"){
            return "You monster."
        }
        else if (evento=="2 kill radiant"){
            return "I hope you're proud of yourself"
        }
        else if (evento=="2 kills dire"){
            return "Those people had families"
        }
        else if (evento=="5 kills radiant"){
            return " Remember that team of living people you used to be alive in?"
        }
        else if (evento=="5 kills dire"){
            return " Everybody seems to be missing. I didn't do it."
        }
        else if (evento=="Torre radiant"){
            return "Dire's tower has been destroyed"
        }
        else if (evento=="Torre dire"){
            return "Radiant's tower has been destroyed"
        }
        else if (evento=="gana radiant"){
            return "Radiant performed marginally less poorly than Dire\n" +
                    "and is, I suppose, the winner."
        }
        else if (evento=="gana dire") {
            return "Dire did not lose as badly as Radiant, and is\n" +
                    "technically the winner."
        }
        return "You paid for the whole seat, so get comfortable because it looks like we may be here a long time."
    }
}