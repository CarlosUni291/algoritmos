package algoritmos.grupo150a159.algoritmo154

fun main() {
    print("Digite placa: ")
    val placa = readln()
    when (placa.lastOrNull()) {
        '1' -> println("janeiro")
        '2' -> println("fevereiro")
        '3' -> println("março")
        '4' -> println("abril")
        '5' -> println("maio")
        '6' -> println("junho")
        '7' -> println("julho")
        '8' -> println("agosto")
        '9' -> println("setembro")
        '0' -> println("outubro")
        else -> println("Opção inválida")
    }
}
