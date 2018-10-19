import GameClases.Equipo
import Narrators.ESPN

fun main(args: Array<String>) {

    val radiant= Equipo()
    val dire = Equipo()
    val game = Game<ESPN>(radiant,dire,0,0, ESPN())
    println(game.narrador.narrar("bienvenida"))
    println(game.narrador.narrar("empieza el juego"))
    println(game.narrador.narrar("Hola"))
}