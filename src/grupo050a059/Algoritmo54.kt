package algoritmos.grupo050a059.algoritmo54

fun main() {
    print("Digite base: ")
    val base = readln().trim().replace(',', '.').toDouble()
    print("Digite altura: ")
    val altura = readln().trim().replace(',', '.').toDouble()
    println("Área: ${base * altura / 2}")
}
