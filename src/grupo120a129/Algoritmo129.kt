package algoritmos.grupo120a129.algoritmo129

fun main() {
    print("Digite salario: ")
    val salario = readln().trim().replace(',', '.').toDouble()
    val desconto = if (salario <= 600) 0.0
    else if (salario <= 1200) salario * 0.2
    else if (salario <= 2000) salario * 0.25
    else salario * 0.3
    println("Desconto do INSS: $desconto")
}
