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
        if(!destruirUnaTorre()){
            this.ancient.isAlive=false
        }

    }
}