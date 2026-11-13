package algoritmos.grupo120a129.algoritmo122

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    if (a < b + c && b < a + c && c < a + b) println("Podem ser lados de um triângulo")
    else println("Não podem ser lados de um triângulo")
}
