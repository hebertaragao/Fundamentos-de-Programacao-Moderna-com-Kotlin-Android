package collections

import java.lang.runtime.ObjectMethods

class Objeto(val nome: String, val descricao: String){
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        if (other is Objeto){
            return nome.equals(other.nome, ignoreCase = true)
        }else{
            return false
        }
    }
}
fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), //Hascode = 7
        Objeto("Mesa", "..."), //Hascode = 4
        Objeto("Faca", "..."), //Hascode = 4
        Objeto("Copo", "..."), //Hascode = 4
    )
    conjunto.contains(Objeto("faca", "???")).print()

}