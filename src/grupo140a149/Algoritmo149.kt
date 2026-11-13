package algoritmos.grupo140a149.algoritmo149

fun main() {
    print("Nome do produto: ")
    val produto = readln()
    print("Valor da compra: ")
    val compra = readln().trim().replace(',', '.').toDouble()
    val venda = when {
        compra < 10 -> compra * 1.7
        compra < 30 -> compra * 1.5
        compra < 50 -> compra * 1.4
        else -> compra * 1.3
    }
    println("$produto será vendido por R$ %.2f".format(java.util.Locale.ROOT, venda))
}
