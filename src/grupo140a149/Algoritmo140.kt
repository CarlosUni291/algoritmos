package algoritmos.grupo140a149.algoritmo140

fun main() {
    print("Primeiro nome: ")
    val nome = readln()
    print("Valor da conta: ")
    val conta = readln().trim().replace(',', '.').toDouble()
    if (nome.firstOrNull()?.uppercaseChar() in listOf('A', 'D', 'M', 'S')) {
        println("$nome: valor da conta com desconto: R$ %.2f".format(java.util.Locale.ROOT, conta * 0.7))
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará")
    }
}
