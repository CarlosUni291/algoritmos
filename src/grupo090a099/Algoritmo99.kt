package algoritmos.grupo090a099.algoritmo99

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    val centenas = numero / 100
    if (centenas % 2 == 0) println("O algarismo das centenas é par: $centenas")
    else println("O algarismo das centenas é ímpar: $centenas")
}
