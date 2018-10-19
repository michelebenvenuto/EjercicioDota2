import GameClases.Equipo

class Game<T> (
        val radiant : Equipo,
        val dire: Equipo,
        val deathsRadiant: Int=0,
        val deathsdire: Int=0,
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

}