package algoritmos.grupo120a129.algoritmo128

fun main() {
    print("Digite verbo: ")
    val verbo = readln()
    val terminacao = verbo.takeLast(2).lowercase()
    if (!verbo.endsWith("r", ignoreCase = true)) println("Verbo não está no infinitivo")
    else when (terminacao) {
        "ar" -> println("Verbo da 1ª conjugação")
        "er", "or", "ôr" -> println("Verbo da 2ª conjugação")
        "ir" -> println("Verbo da 3ª conjugação")
        else -> println("Não existe verbo com essa terminação")
    }
}
