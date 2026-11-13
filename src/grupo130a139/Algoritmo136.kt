package algoritmos.grupo130a139.algoritmo136

fun main() {
    print("Digite o nome: ")
    val nome = readln()
    print("Digite a idade: ")
    val idade = readln().trim().toInt()
    val valor = when {
        idade <= 10 -> 30
        idade <= 29 -> 60
        idade <= 45 -> 120
        idade <= 59 -> 150
        idade <= 65 -> 250
        else -> 400
    }
    println("$nome pagará R$ $valor,00")
}
