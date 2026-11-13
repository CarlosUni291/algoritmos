package algoritmos.grupo130a139.algoritmo135

fun main() {
    print("Digite idade: ")
    val idade = readln().trim().toInt()
    if (idade < 16) println("Não eleitor")
    else if (idade < 18 || idade > 65) println("Eleitor facultativo")
    else println("Eleitor obrigatório")
}
