package collections

fun main() {
    val listaMix = arrayOf("Rafael", true, 1, 3.14, "p")
    for (item  in listaMix){
        if (item is String){ //samrt cast
            println(item.toUpperCase())
        }else{
            println(item)
        }
    }
}