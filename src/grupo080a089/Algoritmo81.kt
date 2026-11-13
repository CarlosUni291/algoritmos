package algoritmos.grupo080a089.algoritmo81

fun main() {
    print("Digite conta: ")
    val conta = readln().trim().toInt()
    val d1 = conta / 100
    val d2 = conta % 100 / 10
    val d3 = conta % 10
    val inverso = d3 * 100 + d2 * 10 + d1
    val soma = conta + inverso
    val digito = (soma / 100 + (soma % 100 / 10) * 2 + (soma % 10) * 3) % 10
    println("Dígito verificador: $digito")
}
