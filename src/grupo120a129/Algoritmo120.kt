package algoritmos.grupo120a129.algoritmo120

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

    val maior = c
    val intermediario = b
    val menor = a
    println("Maior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}
