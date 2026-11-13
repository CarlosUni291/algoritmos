package algoritmos.grupo130a139.algoritmo132

fun main() {
    print("Valor em reais: ")
    val reais = readln().trim().replace(',', '.').toDouble()
    print("Moeda (f - franco suíço, l - libra esterlina, d - dólar, m - marco alemão): ")
    val moeda = readln().trim().lowercase()
    val nome = when (moeda) {
        "f" -> "francos suíços"
        "l" -> "libras esterlinas"
        "d" -> "dólares"
        "m" -> "marcos alemães"
        else -> {
            println("Moeda desconhecida")
            return
        }
    }
    print("Valor de uma unidade da moeda em reais: ")
    val cotacao = readln().trim().replace(',', '.').toDouble()
    if (cotacao <= 0) println("A cotação deve ser positiva.")
    else println("Total de $nome: ${reais / cotacao}")
}
