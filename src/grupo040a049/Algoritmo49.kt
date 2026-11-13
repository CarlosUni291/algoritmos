package algoritmos.grupo040a049.algoritmo49

fun main() {
    print("Digite nome: ")
    val nome = readln()
    println("Todo nome: $nome")
    println("Primeiro caractere: ${nome.firstOrNull() ?: ""}")
    println("Último caractere: ${nome.lastOrNull() ?: ""}")
    println("Primeiro ao terceiro: ${nome.take(3)}")
    println("Quarto caractere: ${nome.getOrNull(3) ?: ""}")
    println("Todos menos o primeiro: ${nome.drop(1)}")
    println("Os dois últimos: ${nome.takeLast(2)}")
}
