package oo.heranca

open class Carro(val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0) {
    protected fun alterarVelcidadeEm(velocidade: Int) {
        val novaVelocidade = velocidadeAtual + velocidade
        velocidadeAtual = when (novaVelocidade) {
            in 0..velocidadeMaxima -> novaVelocidade
            in velocidadeMaxima + 1..Int.MAX_VALUE -> velocidadeMaxima
            else -> 0
        }
    }

    open fun acelerar() {
        alterarVelcidadeEm(5)
    }

    open fun frear() {
        alterarVelcidadeEm(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é: $velocidadeAtual Km/h."
    }
}


