package algoritmos.grupo020a029.algoritmo24

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    val dezenas = (numero / 10) % 10
    println("Algarismo das dezenas: $dezenas")
}
