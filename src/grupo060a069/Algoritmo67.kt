package algoritmos.grupo060a069.algoritmo67

fun main() {
    print("Valor da prestação: ")
    val valor = readln().trim().replace(',', '.').toDouble()
    print("Taxa percentual: ")
    val taxa = readln().trim().replace(',', '.').toDouble()
    print("Tempo em meses: ")
    val tempo = readln().trim().toInt()
    val prestacao = valor + valor * (taxa / 100) * tempo
    println("Prestação em atraso: $prestacao")
}
