package algoritmos.grupo060a069.algoritmo60

fun main() {
    print("Digite primeiroTermo: ")
    val primeiroTermo = readln().trim().toInt()
    print("Digite razao: ")
    val razao = readln().trim().toInt()
    val decimo = primeiroTermo + 9 * razao
    println("10º termo da PA: $decimo")
}
