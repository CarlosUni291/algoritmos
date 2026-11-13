package algoritmos.grupo110a119.algoritmo117

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println("Maior: $maior")
}
