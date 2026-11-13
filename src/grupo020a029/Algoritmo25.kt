package algoritmos.grupo020a029.algoritmo25

fun main() {
    print("Digite a data no formato ddmmaa: ")
    val data = readln().trim().toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    println("Dia: $dia")
    println("Mês: $mes")
    println("Ano: $ano")
}
