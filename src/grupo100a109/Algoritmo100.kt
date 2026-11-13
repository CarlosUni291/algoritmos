package algoritmos.grupo100a109.algoritmo100

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    val inicio = numero / 100
    if (inicio % 4 == 0) println("O número é múltiplo de 4: $inicio")
    else println("O número não é múltiplo de 4: $inicio")
}
