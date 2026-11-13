package algoritmos.grupo060a069.algoritmo66

fun main() {
    print("Digite tempo: ")
    val tempo = readln().trim().replace(',', '.').toDouble()
    print("Digite velocidade: ")
    val velocidade = readln().trim().replace(',', '.').toDouble()
    val distancia = tempo * velocidade
    val litros = distancia / 12
    println("Velocidade média: $velocidade")
    println("Tempo: $tempo")
    println("Distância: $distancia")
    println("Litros usados: $litros")
}
