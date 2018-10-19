package GameClases

data class Heroes(val nombre: String, val tipo: String)
{
    override fun toString(): String {
        return this.nombre
    }
}