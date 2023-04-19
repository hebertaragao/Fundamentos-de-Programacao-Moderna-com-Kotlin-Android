package funcoes

fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(38, 3, 456, 8, 51, 1, 88, 73))
        println("$n")
}