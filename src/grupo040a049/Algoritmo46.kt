package algoritmos.grupo040a049.algoritmo46

fun main() {
    print("Digite saldo: ")
    val saldo = readln().trim().replace(',', '.').toDouble()
    val novoSaldo = saldo * 1.01
    println("Novo saldo: $novoSaldo")
}
