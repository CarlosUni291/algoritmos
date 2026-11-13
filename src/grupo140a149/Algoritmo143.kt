package algoritmos.grupo140a149.algoritmo143

fun main() {
    print("Digite palavra: ")
    val palavra = readln()
    if (palavra.isEmpty()) {
        println("Palavra inválida")
        return
    }
    val meio = palavra.length / 2
    if (palavra.length % 2 == 0) {
        val centro = palavra.substring(meio - 1, meio + 1)
        if (centro == "rr" || centro == "ss") println("É rr ou ss")
        else println("Não é rr ou ss")
    } else {
        if (palavra[meio] in "aeiou") println("É vogal")
        else println("Não é vogal")
    }
}
