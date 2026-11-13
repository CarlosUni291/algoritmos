package algoritmos.grupo120a129.algoritmo125

fun main() {
    print("Digite idade: ")
    val idade = readln().trim().toInt()
    if (idade >= 65) println("Maior de 65 anos")
    else if (idade >= 18) println("Maior de idade")
    else println("Menor de idade")
}
