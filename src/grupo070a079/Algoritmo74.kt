package algoritmos.grupo070a079.algoritmo74

fun main() {
    print("Digite salarioMinimo: ")
    val salarioMinimo = readln().trim().replace(',', '.').toDouble()
    print("Digite salario: ")
    val salario = readln().trim().replace(',', '.').toDouble()
    if (salarioMinimo <= 0) {
        println("O salário mínimo deve ser positivo.")
        return
    }
    println("A pessoa ganha ${salario / salarioMinimo} salários mínimos")
}
