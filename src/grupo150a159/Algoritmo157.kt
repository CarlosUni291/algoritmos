package algoritmos.grupo150a159.algoritmo157

fun main() {
    print("Digite a data no formato ddmmaaaa: ")
    val data = readln().trim().toInt()
    val dia = data / 1000000
    val mes = data % 1000000 / 10000
    val ano = data % 10000

    val bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0
    val diasNoMes = when (mes) {
        4, 6, 9, 11 -> 30
        2 -> if (bissexto) 29 else 28
        in 1..12 -> 31
        else -> 0
    }
    val valida = ano >= 1 && dia >= 1 && dia <= diasNoMes
    if (valida) println("DATA VÁLIDA") else println("DATA INVÁLIDA")
}
