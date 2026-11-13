package algoritmos.grupo080a089.algoritmo85

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    val max = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println("Maior: $max")
}
