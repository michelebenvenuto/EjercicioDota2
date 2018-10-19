import GameClases.Equipo

class Game<T> (
        val radiant : Equipo,
        val dire: Equipo,
        var deathsRadiant: Int=0,
        var deathsdire: Int=0,
        val narrador: T
)where T: Narrador
{
    fun bienvenida():String{
        val stringToReturn= narrador.narrar("bienvenida")
        return stringToReturn.toString()
    }
    fun empezarJuego():String{
        val stringToReturn=narrador.narrar("empieza el juego")
        return stringToReturn.toString()
    }
    fun ocurrioUnKill(esRadiant:Boolean):String{
        if (esRadiant){
            val stringToReturn = narrador.narrar("1 kill radiant")
            deathsdire+=1
            return  stringToReturn
        }
        else{
            deathsRadiant+=1
            return narrador.narrar("1 kill dire")
        }
    }
    fun ocurrioDosOMasKills(esRadiant: Boolean, cuantas: Int):String{
        if (esRadiant){
            deathsdire+= cuantas
            return narrador.narrar("2 kill radiant")
        }
        else{
            deathsRadiant+=cuantas
            return narrador.narrar("2 kills dire")
        }
    }
    fun ocurrio5Kills(esRadiant: Boolean):String{
        if (esRadiant){
            deathsdire+= 5
            return narrador.narrar("5 kills radiant")
        }
        else{
            deathsRadiant+=5
            return narrador.narrar("5 kills dire")
        }
    }
    fun matanUnaTorre(esRadiant: Boolean):String{
        if (esRadiant){
            dire.destruirUnaTorre()
            return narrador.narrar("Torre radiant")
        }
        else{
            radiant.destruirUnaTorre()
            return narrador.narrar("Torre dire")
        }
    }
    fun direGana():String{
        return narrador.narrar("gana dire")
    }
    fun radiantGana():String{
        return narrador.narrar("gana radiant")
    }
}