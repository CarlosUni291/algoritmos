package algoritmos.grupo160a169.algoritmo160

fun main() {
    print("Digite x: ")
    val x = readln().trim().replace(',', '.').toDouble()
    val y = if (x <= 1) 1.0
    else if (x <= 2) 2.0
    else if (x <= 3) x * x
    else x * x * x
    println("Valor de f(x): $y")
}
