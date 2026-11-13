package algoritmos.grupo070a079.algoritmo72

fun main() {
    print("Digite deposito: ")
    val deposito = readln().trim().replace(',', '.').toDouble()
    print("Digite taxa: ")
    val taxa = readln().trim().replace(',', '.').toDouble()
    val rendimento = deposito * taxa / 100
    val total = deposito + rendimento
    println("Rendimento: $rendimento")
    println("Total: $total")
}
