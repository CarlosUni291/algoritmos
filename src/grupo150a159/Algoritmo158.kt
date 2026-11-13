package algoritmos.grupo150a159.algoritmo158

fun main() {
    print("Digite x: ")
    val x = readln().trim().replace(',', '.').toDouble()
    if (x != 2.0) println("f(x): ${8 / (2 - x)}")
    else println("NÃO PODE SER FEITA")
}
