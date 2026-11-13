package algoritmos.grupo080a089.algoritmo86

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 0) println("POSITIVO")
    else if (numero < 0) println("NEGATIVO")
    else println("NULO")
}
