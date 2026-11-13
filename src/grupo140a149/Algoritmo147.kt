package algoritmos.grupo140a149.algoritmo147

fun main() {
    print("Prato (1 - Vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne): ")
    val prato = readln().trim().toInt()
    print("Sobremesa (1 - Abacaxi, 2 - Sorvete diet, 3 - Mousse diet, 4 - Mousse chocolate): ")
    val sobremesa = readln().trim().toInt()
    print("Bebida (1 - Chá, 2 - Suco de laranja, 3 - Suco de melão, 4 - Refrigerante diet): ")
    val bebida = readln().trim().toInt()
    if (prato !in 1..4 || sobremesa !in 1..4 || bebida !in 1..4) {
        println("Opção inválida")
        return
    }
    var calorias = when (prato) {
        1 -> 180
        2 -> 230
        3 -> 250
        else -> 350
    }
    calorias += when (sobremesa) {
        1 -> 75
        2 -> 110
        3 -> 170
        else -> 200
    }
    calorias += when (bebida) {
        1 -> 20
        2 -> 70
        3 -> 100
        else -> 65
    }
    println("Total de calorias: $calorias cal")
}
