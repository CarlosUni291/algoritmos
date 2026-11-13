package algoritmos.grupo060a069.algoritmo65

fun main() {
    print("Digite altura: ")
    val altura = readln().trim().replace(',', '.').toDouble()
    print("Digite raio: ")
    val raio = readln().trim().replace(',', '.').toDouble()
    val volume = 3.14159 * raio * raio * altura
    println("Volume da lata: $volume")
}
