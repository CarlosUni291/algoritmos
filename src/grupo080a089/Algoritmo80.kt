package algoritmos.grupo080a089.algoritmo80

fun main() {
    print("Quantidade de fitas: ")
    val quantidade = readln().trim().toInt()
    print("Valor do aluguel: ")
    val aluguel = readln().trim().replace(',', '.').toDouble()
    val faturamentoAnual = quantidade / 3.0 * aluguel * 12
    val multasMensais = aluguel * 0.1 * (quantidade / 3.0) / 10
    val quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0
    println("Faturamento anual: $faturamentoAnual")
    println("Multas mensais: $multasMensais")
    println("Quantidade de fitas no final do ano: $quantidadeFinal")
}
