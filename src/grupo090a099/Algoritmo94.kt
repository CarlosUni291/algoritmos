package algoritmos.grupo090a099.algoritmo94

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    if (numero % 3 == 0) println("É múltiplo de 3")
    else println("Não é múltiplo de 3")
}
