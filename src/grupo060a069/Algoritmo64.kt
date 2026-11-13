package algoritmos.grupo060a069.algoritmo64

fun main() {
    print("Digite celsius: ")
    val celsius = readln().trim().replace(',', '.').toDouble()
    val fahrenheit = (9 * celsius + 160) / 5
    println("Temperatura em Fahrenheit: $fahrenheit")
}
