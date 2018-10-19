import GameClases.Equipo
import GameClases.Heroes
import Narrators.ESPN
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    val menuNoHayGanador="""
        Menu:
        1) Ocurrieron Muertes
        2) Matan Torres
    """.trimIndent()
    var heroes = arrayListOf<Heroes>(
            Heroes("Alchemist", "Strength"),
            Heroes("Abadon", "Strength"),
            Heroes("Earthshaker", "Strength"),
            Heroes("Doom", "Strength"),
            Heroes("Phoenix", "Strength"),
            Heroes("Magnus", "Strength"),
            Heroes("Sand King", "Strength"),
            Heroes("Night Stalker", "Strength"),
            Heroes("Omniknight", "Strength"),
            Heroes("Timbersaw", "Strength"),
            Heroes("Drow Ranger", "Agility"),
            Heroes("Anti-Mage", "Agility"),
            Heroes("Templar Assassin", "Agility"),
            Heroes("Sniper", "Agility"),
            Heroes("Nyx Assassin", "Agility"),
            Heroes("Rubick", "Intelligence"),
            Heroes("Bane", "Intelligence"),
            Heroes("Oracle", "Intelligence"),
            Heroes("Disruptor", "Intelligence"),
            Heroes("Enchantress", "Intelligence")
    )
    val radiant= Equipo()
    val dire = Equipo()
    val game = Game<ESPN>(radiant,dire,0,0, ESPN())
    var counter = 1
    var isRadiantsTurnToPick= true

    //Para que se mire mejor al momento de iniciar el partido

    println(game.narrador.narrar("bienvenida"))
    Thread.sleep(500)
    println("------------")
    println("Single Draft")
    println("------------")
    Thread.sleep(500)
    println("------")
    println("Radiant")
    println("-------")
    Thread.sleep(500)

    //Se seleccionan los Heores de cada equipo
    do{
        for (Heroes in heroes) {
            println("${heroes.indexOf(Heroes) + 1} $Heroes")
        }
        if (isRadiantsTurnToPick) {
            print("Eleccion :")
            var pickedChampion = readLine()!!.toInt()
            var heroPicked = heroes.removeAt(pickedChampion - 1)
            radiant.heroes.add(heroPicked)
            isRadiantsTurnToPick=!isRadiantsTurnToPick
        }else{
            print("Eleccion :")
            var pickedChampion = readLine()!!.toInt()
            var heroPicked = heroes.removeAt(pickedChampion - 1)
            dire.heroes.add(heroPicked)
            isRadiantsTurnToPick=!isRadiantsTurnToPick
            }
         Thread.sleep(500)
        if (isRadiantsTurnToPick){
            println("------")
            println("Radiant")
            println("-------")
        }else{
            println("------")
            println("Dire")
            println("------")
        }
    }while (radiant.heroes.size<5||dire.heroes.size<5)
    println("----------------")
    println("Empieza el Juego")
    println("----------------")
    println(game.narrador.narrar("empieza el juego"))

}