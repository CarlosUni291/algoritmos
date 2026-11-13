package algoritmos.grupo070a079.algoritmo78

fun main() {
    print("Digite lados: ")
    val lados = readln().trim().toInt()
    val diagonais = lados * (lados - 3) / 2
    println("Número de diagonais: $diagonais")
}
