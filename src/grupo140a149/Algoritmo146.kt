package algoritmos.grupo140a149.algoritmo146

fun main() {
    print("Tipo de carro (A/B/C): ")
    val tipo = readln()
    print("Percurso em quilômetros: ")
    val percurso = readln().trim().replace(',', '.').toDouble()
    val rendimento = when (tipo.uppercase()) {
        "C" -> 12.0
        "B" -> 9.0
        "A" -> 8.0
        else -> {
            println("Modelo inexistente")
            return
        }
    }
    val consumo = percurso / rendimento
    println("Consumo estimado em litros: %.2f".format(java.util.Locale.ROOT, consumo))
}
