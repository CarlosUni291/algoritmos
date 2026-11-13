package algoritmos.grupo060a069.algoritmo68

fun main() {
    print("Digite a: ")
    var a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    var b = readln().trim().replace(',', '.').toDouble()
    val aux = a
    a = b
    b = aux
    println("A: $a")
    println("B: $b")
}
