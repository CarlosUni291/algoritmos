package algoritmos.grupo060a069.algoritmo62

fun main() {
    print("Digite preco: ")
    val preco = readln().trim().replace(',', '.').toDouble()
    val novoPreco = preco * 0.91
    println("Preço com desconto: $novoPreco")
}
