package algoritmos.grupo060a069.algoritmo63

fun main() {
    print("Número de aulas no mês: ")
    val aulas = readln().trim().toInt()
    print("Valor da hora-aula: ")
    val valorHora = readln().trim().replace(',', '.').toDouble()
    print("Percentual do INSS: ")
    val percentual = readln().trim().replace(',', '.').toDouble()
    val salarioBruto = aulas * valorHora
    val desconto = percentual / 100 * salarioBruto
    val salarioLiquido = salarioBruto - desconto
    println("Salário líquido: $salarioLiquido")
}
