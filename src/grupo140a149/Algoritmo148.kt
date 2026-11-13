package algoritmos.grupo140a149.algoritmo148

fun main() {
    print("Destino (1 - Norte, 2 - Nordeste, 3 - Centro-Oeste, 4 - Sul): ")
    val destino = readln().trim().toInt()
    print("Viagem (1 - Ida, 2 - Ida e volta): ")
    val viagem = readln().trim().toInt()
    if (viagem !in 1..2) {
        println("Opção inexistente")
        return
    }
    val preco = when (destino) {
        1 -> if (viagem == 1) 500 else 900
        2 -> if (viagem == 1) 350 else 650
        3 -> if (viagem == 1) 350 else 600
        4 -> if (viagem == 1) 300 else 550
        else -> {
            println("Opção inexistente")
            return
        }
    }
    println("Preço da passagem: R$ $preco,00")
}
