package algoritmos.grupo150a159.algoritmo155

fun main() {
    print("Digite palavra: ")
    val palavra = readln()
    val inicial = palavra.firstOrNull()?.uppercaseChar()
    val novaPalavra = if (inicial == 'L' || inicial == 'D') palavra.take(2) + palavra.last() else palavra.drop(1)
    println("Palavra: $novaPalavra")
}
