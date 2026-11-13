package algoritmos.grupo120a129.algoritmo127

fun main() {
    print("Digite o nome: ")
    val nome = readln()
    print("Nota da PR1: ")
    val pr1 = readln().trim().replace(',', '.').toDouble()
    print("Nota da PR2: ")
    val pr2 = readln().trim().replace(',', '.').toDouble()
    val media = (pr1 + pr2) / 2
    val situacao = if (media >= 7) "Aprovado" else if (media < 3) "Reprovado" else "Prova Final"
    println("Nome: $nome")
    println("PR1: $pr1")
    println("PR2: $pr2")
    println("Média: $media")
    println(situacao)
}
