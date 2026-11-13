package algoritmos.grupo130a139.algoritmo131

fun main() {
    print("Digite nome: ")
    val nome = readln()
    val inicial = nome.firstOrNull()?.uppercaseChar()
    val sala = when (inicial) {
        in 'A'..'K' -> 101
        in 'L'..'N' -> 102
        in 'O'..'Z' -> 103
        else -> {
            println("Nome inválido")
            return
        }
    }
    println("$nome: bloco F, sala $sala")
}
