package algoritmos.grupo110a119.algoritmo116

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    if (a > b) {
        if (a > c) println("Maior: $a") else println("Maior: $c")
    } else {
        if (b > c) println("Maior: $b") else println("Maior: $c")
    }
}
