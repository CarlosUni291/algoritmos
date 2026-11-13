package algoritmos.grupo090a099.algoritmo90

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 20) println(numero)
}
