package algoritmos.grupo150a159.algoritmo153

fun main() {
    print("Digite indice: ")
    val indice = readln().trim().replace(',', '.').toDouble()
    when {
        indice >= 0.5 -> println("Suspender atividades das indústrias dos grupos 1, 2 e 3")
        indice >= 0.4 -> println("Suspender atividades das indústrias dos grupos 1 e 2")
        indice >= 0.3 -> println("Suspender atividades das indústrias do grupo 1")
        else -> println("Índice de poluição aceitável para todos os grupos")
    }
}
