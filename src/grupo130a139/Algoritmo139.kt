package algoritmos.grupo130a139.algoritmo139

fun main() {
    print("Nome do município: ")
    val municipio = readln()
    print("Eleitores aptos: ")
    val eleitores = readln().trim().toInt()
    print("Votos do candidato mais votado: ")
    val votos = readln().trim().toInt()
    if (eleitores > 20000 && votos <= eleitores / 2) println("$municipio terá segundo turno")
    else println("$municipio não terá segundo turno")
}
