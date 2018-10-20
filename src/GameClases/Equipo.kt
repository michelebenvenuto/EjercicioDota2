package GameClases

class Equipo(
        val heroes: ArrayList<Heroes> = ArrayList(),
        val torres: ArrayList<Torre> = ArrayList() ,
        val ancient: Ancient = Ancient()
)
{
    fun destruirUnaTorre():Boolean{
        for (torre in this.torres){
            if (torre.isAlive){
                torre.isAlive=false
                return true
            }
        }
        return false
    }
    fun destruirAncient(){
            this.ancient.isAlive=false
    }
    fun areThereTowersStillAlive():Boolean{
        val aliveTowers = torres.filter { it.isAlive }
        if (aliveTowers.count()>0){
            return true
        }
        return false
    }
}