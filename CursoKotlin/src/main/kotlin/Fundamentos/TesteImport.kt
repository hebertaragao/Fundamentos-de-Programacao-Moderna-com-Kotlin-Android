package Fundamentos

import Fundamentos.PacoteA.simplesFuncao as funcaoSimples
import Fundamentos.PacoteA.Coisa
import Fundamentos.PacoteA.FaceMoeda.CARA
import Fundamentos.PacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("OK"))
    val Coisa = Coisa("Bola")
    println(Coisa.Nome)
    println(CARA)
    println("${Fundamentos.PacoteB.soma(2,3)} ${subtracao(4,6)}")
}