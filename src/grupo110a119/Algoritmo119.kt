package algoritmos.grupo110a119.algoritmo119

fun main() {
    print("Digite a: ")
    var a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    var b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    var c = readln().trim().replace(',', '.').toDouble()
    if (a > b) {
        val aux = a
        a = b
        b = aux
    }
    if (a > c) {
        val aux = a
        a = c
        c = aux
    }
    if (b > c) {
        val aux = b
        b = c
        c = aux
    }
    println("Ordem decrescente: $c $b $a")
}
