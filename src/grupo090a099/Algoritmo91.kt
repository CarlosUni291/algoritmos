package algoritmos.grupo090a099.algoritmo91

fun main() {
    print("Digite numero1: ")
    val numero1 = readln().trim().toInt()
    print("Digite numero2: ")
    val numero2 = readln().trim().toInt()
    val soma = numero1 + numero2
    if (soma > 10) println("Soma: $soma")
}
