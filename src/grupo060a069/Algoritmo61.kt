package algoritmos.grupo060a069.algoritmo61

fun main() {
    print("Digite primeiroTermo: ")
    val primeiroTermo = readln().trim().toInt()
    print("Digite razao: ")
    val razao = readln().trim().toInt()
    val quinto = primeiroTermo * razao * razao * razao * razao
    println("5º termo da PG: $quinto")
}
