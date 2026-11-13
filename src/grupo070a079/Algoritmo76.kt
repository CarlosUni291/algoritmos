package algoritmos.grupo070a079.algoritmo76

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    println("Sucessor: ${(numero + 1) % 61}")
}
