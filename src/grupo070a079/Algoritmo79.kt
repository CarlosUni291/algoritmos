package algoritmos.grupo070a079.algoritmo79

import kotlin.math.*

fun main() {
    print("Aplicação mensal: ")
    val aplicacao = readln().trim().replace(',', '.').toDouble()
    print("Taxa entre 0 e 1: ")
    val taxa = readln().trim().replace(',', '.').toDouble()
    print("Número de meses: ")
    val meses = readln().trim().toInt()
    val acumulado = if (taxa == 0.0) aplicacao * meses else aplicacao * ((1 + taxa).pow(meses) - 1) / taxa
    println("Valor acumulado: $acumulado")
}
