package algoritmos.grupo130a139.algoritmo134

fun main() {
    print("Digite idade: ")
    val idade = readln().trim().toInt()
    when {
        idade < 5 -> println("Não existe categoria para essa idade")
        idade <= 7 -> println("Categoria Infantil A")
        idade <= 10 -> println("Categoria Infantil B")
        idade <= 13 -> println("Categoria Juvenil A")
        idade <= 17 -> println("Categoria Juvenil B")
        else -> println("Categoria Sênior")
    }
}
