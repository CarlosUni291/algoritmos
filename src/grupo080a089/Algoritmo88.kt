package algoritmos.grupo080a089.algoritmo88

fun main() {
    println("*************")
    println("*CALCULADORA*")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")
    print("Digite a opção: ")
    val opcao = readln().trim()
    if (opcao !in listOf("+", "-", "*", "/")) {
        println("OPÇÃO NÃO DISPONÍVEL!")
        return
    }
    print("Digite o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()
    when (opcao) {
        "+" -> println("Soma: ${a + b}")
        "-" -> println("Subtração: ${a - b}")
        "*" -> println("Multiplicação: ${a * b}")
        "/" -> if (b == 0.0) println("Não é possível dividir por zero.") else println("Divisão: ${a / b}")
    }
}
