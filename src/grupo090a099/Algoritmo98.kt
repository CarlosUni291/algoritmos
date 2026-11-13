package algoritmos.grupo090a099.algoritmo98

fun main() {
    print("Digite salarioBruto: ")
    val salarioBruto = readln().trim().replace(',', '.').toDouble()
    print("Digite prestacao: ")
    val prestacao = readln().trim().replace(',', '.').toDouble()
    if (prestacao <= 0.3 * salarioBruto) println("Empréstimo concedido")
    else println("Empréstimo negado")
}
