package algoritmos.grupo110a119.algoritmo113

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    if (a < b) println("$a $b") else println("$b $a")
}
