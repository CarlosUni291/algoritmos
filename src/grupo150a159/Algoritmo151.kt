package algoritmos.grupo150a159.algoritmo151

fun main() {
    print("Nome do paciente: ")
    val nome = readln()
    print("Peso em kg: ")
    val peso = readln().trim().replace(',', '.').toDouble()
    print("Altura em metros: ")
    val altura = readln().trim().replace(',', '.').toDouble()
    if (altura <= 0) {
        println("A altura deve ser positiva.")
        return
    }
    val imc = peso / (altura * altura)
    val risco = when {
        imc < 20 -> "abaixo do peso"
        imc <= 25 -> "normal"
        imc <= 30 -> "excesso de peso"
        imc <= 35 -> "obesidade"
        else -> "obesidade mórbida"
    }
    println("$nome: $risco")
}
