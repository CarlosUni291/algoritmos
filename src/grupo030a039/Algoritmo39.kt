package algoritmos.grupo030a039.algoritmo39

fun main() {
    print("Digite numero1: ")
    val numero1 = readln().trim().replace(',', '.').toDouble()
    print("Digite numero2: ")
    val numero2 = readln().trim().replace(',', '.').toDouble()
    val media = (numero1 + numero2) / 2
    println("Média: $media")
}
