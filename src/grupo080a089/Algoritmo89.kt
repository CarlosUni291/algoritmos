package algoritmos.grupo080a089.algoritmo89

fun main() {
    println("1 - Mercúrio")
    println("2 - Vênus")
    println("3 - Marte")
    println("4 - Júpiter")
    println("5 - Saturno")
    println("6 - Urano")
    print("Escolha o planeta: ")
    val planeta = readln().trim().toInt()
    print("Digite o peso na Terra: ")
    val peso = readln().trim().replace(',', '.').toDouble()
    val gravidade = when (planeta) {
        1 -> 0.37
        2 -> 0.88
        3 -> 0.38
        4 -> 2.64
        5 -> 1.15
        6 -> 1.17
        else -> {
            println("Este planeta não pode ser analisado.")
            return
        }
    }
    println("Peso no planeta escolhido: ${peso / 10 * gravidade}")
}
