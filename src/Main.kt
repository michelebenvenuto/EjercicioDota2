import GameClases.Equipo
import GameClases.Heroes
import GameClases.Torre
import Narrators.ESPN
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    val menuNoHayGanador="""
        Menu:
        1) Ocurrieron Muertes
        2) Matan Torres
    """.trimIndent()
    val menuHayGanador="""
        Menu:
        1) Ocurrieron Muertes
        2) Matan Torres
        3) Matar Ancient
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
    //se agregan las torres de radiant
    radiant.torres.add(Torre())
    radiant.torres.add(Torre())
    radiant.torres.add(Torre())
    radiant.torres.add(Torre())
    radiant.torres.add(Torre())
    radiant.torres.add(Torre())
    val dire = Equipo()
    //se agregan las torres de dire
    dire.torres.add(Torre())
    dire.torres.add(Torre())
    dire.torres.add(Torre())
    dire.torres.add(Torre())
    dire.torres.add(Torre())
    dire.torres.add(Torre())
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
    }while (radiant.heroes.size<5 || dire.heroes.size<5)
    println("----------------")
    println("Empieza el Juego")
    println("----------------")
    println(game.narrador.narrar("empieza el juego"))

    //Durante el juego
    var thereIsAWinner=false
    do {
        if (!radiant.areThereTowersStillAlive() || !dire.areThereTowersStillAlive()){
            println(menuHayGanador)
            print(">>")
            var selectedOption=readLine()!!.toInt()
            when(selectedOption){
                1->{
                    println("Fue Radiant quien mato? si/no")
                    print(">>")
                    var equipoQueMato= readLine()!!.toUpperCase()
                    if (equipoQueMato=="SI"){
                        print("Cuantas? ")
                        var cuantas= readLine()!!.toInt()
                        if (cuantas==1){
                            println(game.ocurrioUnKill(true))
                        }
                        else if(cuantas>1 && cuantas<5){
                            println(game.ocurrioDosOMasKills(true, cuantas))
                        }else if(cuantas==5){
                            println(game.ocurrio5Kills(true))
                        }
                    }
                    else if(equipoQueMato=="NO"){
                        print("Cuantas? ")
                        var cuantas= readLine()!!.toInt()
                        if (cuantas==1){
                            println(game.ocurrioUnKill(false))
                        }
                        else if(cuantas>1 && cuantas<5){
                            println(game.ocurrioDosOMasKills(false, cuantas))
                        }else if(cuantas==5){
                            println(game.ocurrio5Kills(false))
                        }

                    }

                }

                2->{
                    println("Fue Radiant quien mato? si/no")
                    print(">>")
                    var equipoQueMato= readLine()!!.toUpperCase()
                    if (equipoQueMato=="SI"){
                        println(game.matanUnaTorre(true))
                    }
                    else if (equipoQueMato=="NO"){
                        println(game.matanUnaTorre(false))
                    }
                }
                3->{
                    println("Fue Radiant quien mato? si/no")
                    print(">>")
                    var equipoQueMato= readLine()!!.toUpperCase()
                    if (equipoQueMato=="SI"){
                        game.dire.destruirAncient()
                        thereIsAWinner=true
                        println(game.radiantGana())
                    }
                    else if(equipoQueMato=="NO"){
                        game.radiant.destruirAncient()
                        thereIsAWinner=true
                        println(game.direGana())
                    }
                }
            }
        }
        else{
            println(menuNoHayGanador)
            print(">>")
            var selectedOption=readLine()!!.toInt()
            when(selectedOption){
                1->{
                    println("Fue Radiant quien mato? si/no")
                    print(">>")
                    var equipoQueMato= readLine()!!.toUpperCase()
                    if (equipoQueMato=="SI"){
                        print("Cuantas? ")
                        var cuantas= readLine()!!.toInt()
                        if (cuantas==1){
                            println(game.ocurrioUnKill(true))
                        }
                        else if(cuantas>1 && cuantas<5){
                            println(game.ocurrioDosOMasKills(true, cuantas))
                        }else if(cuantas==5){
                            println(game.ocurrio5Kills(true))
                        }
                    }
                    else if(equipoQueMato=="NO"){
                        print("Cuantas? ")
                        var cuantas= readLine()!!.toInt()
                        if (cuantas==1){
                            println(game.ocurrioUnKill(false))
                        }
                        else if(1<cuantas && cuantas<5){
                            println(game.ocurrioDosOMasKills(false, cuantas))
                        }else if(cuantas==5){
                            println(game.ocurrio5Kills(false))
                        }

                    }
                }
                2->{
                    println("Fue Radiant quien mato? si/no")
                    print(">>")
                    var equipoQueMato= readLine()!!.toUpperCase()
                    if (equipoQueMato=="SI"){
                        println(game.matanUnaTorre(true))
                    }
                    else if (equipoQueMato=="NO"){
                        println(game.matanUnaTorre(false))
                    }
                }
            }
        }
    }while (thereIsAWinner==false)

}