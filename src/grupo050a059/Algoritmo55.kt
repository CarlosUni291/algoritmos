package algoritmos.grupo050a059.algoritmo55

fun main() {
    print("Digite diagonalMaior: ")
    val diagonalMaior = readln().trim().replace(',', '.').toDouble()
    print("Digite diagonalMenor: ")
    val diagonalMenor = readln().trim().replace(',', '.').toDouble()
    val area = diagonalMaior * diagonalMenor / 2
    println("Área: $area")
}
