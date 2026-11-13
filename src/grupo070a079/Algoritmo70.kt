package algoritmos.grupo070a079.algoritmo70

fun main() {
    print("Digite conta: ")
    val conta = readln().trim().replace(',', '.').toDouble()
    val total = conta * 1.1
    println("Conta com gorjeta: R$ %.2f".format(java.util.Locale.ROOT, total))
}
