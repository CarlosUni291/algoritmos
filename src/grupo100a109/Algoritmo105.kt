package algoritmos.grupo100a109.algoritmo105

fun main() {
    print("Digite sigla: ")
    val sigla = readln()
    when (sigla.uppercase()) {
        "RJ" -> println("carioca")
        "SP" -> println("paulista")
        "MG" -> println("mineiro")
        else -> println("outros estados")
    }
}
