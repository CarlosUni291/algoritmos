package algoritmos.grupo110a119.algoritmo112

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    if (a < b) println("Menor: $a") else println("Menor: $b")
}
