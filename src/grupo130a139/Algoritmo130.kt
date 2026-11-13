package algoritmos.grupo130a139.algoritmo130

fun main() {
    print("Digite valor: ")
    val valor = readln().trim().replace(',', '.').toDouble()
    val venda = if (valor < 20) valor * 1.45 else valor * 1.3
    println("Valor de venda: $venda")
}
