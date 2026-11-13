package algoritmos.grupo060a069.algoritmo69

fun main() {
    print("Digite numerador: ")
    val numerador = readln().trim().toInt()
    print("Digite denominador: ")
    val denominador = readln().trim().toInt()
    if (denominador == 0) {
        println("O denominador não pode ser zero.")
        return
    }
    println("Decimal: ${numerador.toDouble() / denominador}")
}
