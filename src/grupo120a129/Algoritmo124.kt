package algoritmos.grupo120a129.algoritmo124

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val lados: Double
        if (a > b && a > c) {
            maior = a * a
            lados = b * b + c * c
        } else if (b > c) {
            maior = b * b
            lados = a * a + c * c
        } else {
            maior = c * c
            lados = a * a + b * b
        }
        if (maior == lados) println("Triângulo retângulo")
        else if (maior > lados) println("Triângulo obtusângulo")
        else println("Triângulo acutângulo")
    } else println("As medidas não formam um triângulo")
}
