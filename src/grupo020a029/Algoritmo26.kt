package algoritmos.grupo020a029.algoritmo26

fun main() {
    print("Digite a data no formato ddmmaa: ")
    val data = readln().trim().toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    val novaData = mes * 10000 + dia * 100 + ano
    println("Dia: $dia")
    println("Mês: $mes")
    println("Ano: $ano")
    println("Data no formato mmddaa: ${novaData.toString().padStart(6, '0')}")
}
