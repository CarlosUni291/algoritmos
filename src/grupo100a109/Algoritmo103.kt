package algoritmos.grupo100a109.algoritmo103

fun main() {
    print("Digite anoAtual: ")
    val anoAtual = readln().trim().toInt()
    print("Digite anoNascimento: ")
    val anoNascimento = readln().trim().toInt()
    if (anoNascimento < 1 || anoNascimento > anoAtual) println("Ano de nascimento inválido")
    else println("Idade: ${anoAtual - anoNascimento}")
}
