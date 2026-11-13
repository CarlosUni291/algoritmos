package algoritmos.grupo120a129.algoritmo123

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) println("Triângulo equilátero")
        else if (a == b || a == c || b == c) println("Triângulo isósceles")
        else println("Triângulo escaleno")
    } else println("As medidas não formam um triângulo")
}
