package algoritmos.grupo030a039.algoritmo38

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    println("Terça parte: ${numero / 3}")
}
