package GameClases

class Equipo(
        val heroes: ArrayList<Heroes>,
        val torres: ArrayList<Torre>,
        val ancient: Ancient
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
}