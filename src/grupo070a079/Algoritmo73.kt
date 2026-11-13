package algoritmos.grupo070a079.algoritmo73

import kotlin.math.*

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    val inteiro = numero.toInt()
    val fracionario = numero - inteiro
    val arredondado = floor(numero + 0.5).toInt()
    println("Parte inteira: $inteiro")
    println("Parte fracionária: %.3f".format(java.util.Locale.ROOT, fracionario))
    println("Número arredondado: $arredondado")
}
