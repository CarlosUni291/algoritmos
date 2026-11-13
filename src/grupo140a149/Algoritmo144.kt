package algoritmos.grupo140a149.algoritmo144

fun main() {
    print("Digite saldoMedio: ")
    val saldoMedio = readln().trim().replace(',', '.').toDouble()
    val credito = when {
        saldoMedio < 501 -> 0.0
        saldoMedio < 1001 -> saldoMedio * 0.3
        saldoMedio < 3001 -> saldoMedio * 0.4
        else -> saldoMedio * 0.5
    }
    println("Saldo médio: $saldoMedio")
    if (credito == 0.0) println("Você não terá nenhum crédito")
    else println("Crédito: %.2f".format(java.util.Locale.ROOT, credito))
}
