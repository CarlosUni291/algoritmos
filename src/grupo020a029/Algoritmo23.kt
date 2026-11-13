package algoritmos.grupo020a029.algoritmo23

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    val dezenas = numero % 100 / 10
    println("Algarismo das dezenas: $dezenas")
}
