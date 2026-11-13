package algoritmos.grupo090a099.algoritmo96

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    if (numero % 3 == 0 && numero % 7 == 0) println("É divisível por 3 e por 7")
    else println("Não é divisível por 3 e por 7")
}
