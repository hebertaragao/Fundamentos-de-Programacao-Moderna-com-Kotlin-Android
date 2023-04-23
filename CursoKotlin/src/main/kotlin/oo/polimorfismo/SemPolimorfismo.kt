package oo.polimorfismo

class Feijao2(val peso: Double)
class Arroz2(val peso: Double)
class Pessoa2(var peso: Double){
    fun comer(feijao: Feijao2){
        peso += feijao.peso
    }
    fun comer(arroz: Arroz2){
        peso += arroz.peso
    }
}

fun main() {
    val feijao2 = Feijao2(0.3)
    val arroz2 = Arroz2(0.3)

    val Joao = Pessoa2(80.5)
    Joao.comer(feijao2)
    Joao.comer(arroz2)

    println(Joao.peso)
}
