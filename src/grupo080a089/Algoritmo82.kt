package algoritmos.grupo080a089.algoritmo82

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 20) println("Metade: ${numero / 2}")
}
