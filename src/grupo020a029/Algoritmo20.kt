package algoritmos.grupo020a029.algoritmo20

fun main() {
    print("Digite c: ")
    val c = readln()
    print("Digite c1: ")
    val c1 = readln()
    println("Tamanho da primeira palavra: ${c.length}")
    println("Concatenando: ${c + c1}")
    val d = c
    println("Conteúdo de d: $d")
    val d1 = c + c1
    println("Concatenação: $d1")
    println("Primeiro caractere: ${c.firstOrNull() ?: ""}")
    println("Último caractere: ${c.lastOrNull() ?: ""}")
    println("Todos menos o primeiro: ${c.drop(1)}")
    println("Elemento de índice 3: ${c.getOrNull(3) ?: ""}")
    println("Três primeiros elementos: ${c.take(3)}")
    println("Elementos a partir do índice 3: ${c.drop(3)}")
}
