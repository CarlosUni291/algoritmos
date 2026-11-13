package algoritmos.grupo140a149.algoritmo141

fun main() {
    print("Primeiro finalista: ")
    var nome1 = readln()
    print("Pontos: ")
    var p1 = readln().trim().toInt()
    print("Segundo finalista: ")
    var nome2 = readln()
    print("Pontos: ")
    var p2 = readln().trim().toInt()
    print("Terceiro finalista: ")
    var nome3 = readln()
    print("Pontos: ")
    var p3 = readln().trim().toInt()
    if (p1 < p2) {
        val aux = p1
        p1 = p2
        p2 = aux
        val auxNome = nome1
        nome1 = nome2
        nome2 = auxNome
    }
    if (p1 < p3) {
        val aux = p1
        p1 = p3
        p3 = aux
        val auxNome = nome1
        nome1 = nome3
        nome3 = auxNome
    }
    if (p2 < p3) {
        val aux = p2
        p2 = p3
        p3 = aux
        val auxNome = nome2
        nome2 = nome3
        nome3 = auxNome
    }
    println("Vencedor: $nome1 $p1 pontos")
    println("Segundo colocado: $nome2 $p2 pontos")
    println("Terceiro colocado: $nome3 $p3 pontos")
}
