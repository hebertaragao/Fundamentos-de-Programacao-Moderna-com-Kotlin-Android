package visao

import modelo.CampoEvento
import modelo.Tabuleiro
import modelo.TabuleiroEvento
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.SwingUtilities

fun main() {
    TelaPrincipal()
}
class TelaPrincipal : JFrame(){
    private val tabuleiro = Tabuleiro(qtdeLinhas = 16, qtdeColunas = 30, qtdeMinas = 96)
    private val painelTabuleiro = PainelTabuleiro(tabuleiro)

    init {
        tabuleiro.onEvento (this::mostrarResultado)
        add(painelTabuleiro)

        setSize(690,438)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "******************** CAMPO MINADO ********************** Desenvolvido por HEBERT ARAGÃO"
        isVisible = true
    }
    private fun mostrarResultado(evento: TabuleiroEvento){
        SwingUtilities.invokeLater {
            val msg = when(evento){
                TabuleiroEvento.VITORIA -> "Você Ganhou!!! \nParabéns!!!"
                TabuleiroEvento.DERROTA -> "Você Perdeu... :P\n Tente Novamente!"
            }
            JOptionPane.showMessageDialog(this, msg)
            tabuleiro.reiniciar()

            painelTabuleiro.repaint()
            painelTabuleiro.validate()
        }
    }
}