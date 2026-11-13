package algoritmos.grupo090a099.algoritmo97

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    if (numero % 10 == 0) println("É múltiplo de 10")
    else if (numero % 2 == 0) println("É múltiplo de 2")
    else if (numero % 5 == 0) println("É múltiplo de 5")
    else println("Não é divisível por 10, por 5 nem por 2")
}
