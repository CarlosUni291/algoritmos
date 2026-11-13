package algoritmos.grupo090a099.algoritmo92

fun main() {
    print("Digite numero1: ")
    val numero1 = readln().trim().replace(',', '.').toDouble()
    print("Digite numero2: ")
    val numero2 = readln().trim().replace(',', '.').toDouble()
    val soma = numero1 + numero2
    if (soma > 20) println("Resultado: ${soma + 8}")
    else println("Resultado: ${soma - 5}")
}
