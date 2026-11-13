package algoritmos.grupo020a029.algoritmo22

import kotlin.math.*

fun main() {
    println("TESTANDO HIERARQUIA")
    println("18 / 6 % 2 no UAL = ${18.0 / (6 % 2)}")
    println("No UAL, % tem prioridade sobre /; o divisor é zero nesta expressão.")
    println("20 / 4 div 2 = ${round((20.0 / 4) / 2).toInt()}")
    println("(20 / 4) div 2 = ${round((20.0 / 4) / 2).toInt()}")
    println("30 / 4 div 2 = ${round((30.0 / 4) / 2).toInt()}")
    println("(30 / 4) div 2 = ${round((30.0 / 4) / 2).toInt()}")
    println("7. div 4 = ${round(7.0 / 4).toInt()}")
    println("7 div 4 = ${7 / 4}")
    println("6. div 4 = ${round(6.0 / 4).toInt()}")
    println("6 div 4 = ${6 / 4}")
}
