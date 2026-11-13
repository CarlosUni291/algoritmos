package algoritmos.grupo130a139.algoritmo133

fun main() {
    print("Digite a altura: ")
    val altura = readln().trim().replace(',', '.').toDouble()
    print("Digite o sexo (M/F): ")
    val sexo = readln()
    val peso = if (sexo.equals("m", ignoreCase = true)) 72.7 * altura - 58 else 62.1 * altura - 44.7
    println("Peso ideal: $peso")
}
