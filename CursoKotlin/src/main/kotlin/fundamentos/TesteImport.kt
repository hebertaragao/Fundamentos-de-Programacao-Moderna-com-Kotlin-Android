package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("OK"))
    val Coisa = Coisa("Bola")
    println(Coisa.Nome)
    println(CARA)
    println("${fundamentos.pacoteB.soma(2,3)} ${subtracao(4,6)}")
}