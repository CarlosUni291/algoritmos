package algoritmos.grupo130a139.algoritmo138

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().toInt()
    when (numero) {
        1 -> println("janeiro")
        2 -> println("fevereiro")
        3 -> println("março")
        4 -> println("abril")
        5 -> println("maio")
        6 -> println("junho")
        7 -> println("julho")
        8 -> println("agosto")
        9 -> println("setembro")
        10 -> println("outubro")
        11 -> println("novembro")
        12 -> println("dezembro")
        else -> println("Não existe mês correspondente a este número")
    }
}
