package algoritmos.grupo040a049.algoritmo41

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    print("Digite d: ")
    val d = readln().trim().replace(',', '.').toDouble()
    val media = (a + 2 * b + 3 * c + 4 * d) / 10
    println("Média ponderada: $media")
}
