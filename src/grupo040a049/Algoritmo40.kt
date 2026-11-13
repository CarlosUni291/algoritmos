package algoritmos.grupo040a049.algoritmo40

fun main() {
    print("Digite dividendo: ")
    val dividendo = readln().trim().toInt()
    print("Digite divisor: ")
    val divisor = readln().trim().toInt()
    if (divisor == 0) {
        println("O divisor não pode ser zero.")
        return
    }
    val quociente = dividendo / divisor
    val resto = dividendo % divisor
    println("Dividendo: $dividendo")
    println("Divisor: $divisor")
    println("Quociente: $quociente")
    println("Resto: $resto")
}
