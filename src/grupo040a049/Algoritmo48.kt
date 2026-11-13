package algoritmos.grupo040a049.algoritmo48

fun main() {
    print("Digite salarioMinimo: ")
    val salarioMinimo = readln().trim().replace(',', '.').toDouble()
    print("Digite quilowatts: ")
    val quilowatts = readln().trim().replace(',', '.').toDouble()
    val preco = salarioMinimo / 700
    val valor = preco * quilowatts
    val valorComDesconto = valor * 0.9
    println("Preço do quilowatt: $preco")
    println("Valor a pagar: $valor")
    println("Valor com desconto: $valorComDesconto")
}
