package algoritmos.grupo100a109.algoritmo104

fun main() {
    print("Digite o nome: ")
    val nome = readln()
    print("Digite o sexo: ")
    val sexo = readln()
    print("Digite a idade: ")
    val idade = readln().trim().toInt()
    if (sexo.equals("f", ignoreCase = true) && idade < 25) println("$nome ACEITA")
    else println("$nome NÃO ACEITA")
}
