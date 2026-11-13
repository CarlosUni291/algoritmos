package algoritmos.grupo040a049.algoritmo47

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    val centenas = numero / 100
    val dezenas = numero % 100 / 10
    val unidades = numero % 10
    val invertido = unidades * 100 + dezenas * 10 + centenas
    println("Número: $numero")
    println("Invertido: $invertido")
}
