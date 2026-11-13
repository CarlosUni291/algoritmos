package algoritmos.grupo120a129.algoritmo126

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    when {
        numero == 5.0 -> println("O número é o 5")
        numero == 200.0 -> println("O número é o 200")
        numero == 400.0 -> println("O número é o 400")
        numero >= 500 && numero <= 1000 -> println("Intervalo 500-1000")
        else -> println("Fora do escopo")
    }
}
