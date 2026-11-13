package algoritmos.grupo140a149.algoritmo142

fun main() {
    print("Digite a: ")
    var a = readln().trim().toInt()
    print("Digite b: ")
    var b = readln().trim().toInt()
    print("Digite c: ")
    var c = readln().trim().toInt()
    if (a > b) {
        val aux = a
        a = b
        b = aux
    }
    if (a > c) {
        val aux = a
        a = c
        c = aux
    }
    if (b > c) {
        val aux = b
        b = c
        c = aux
    }

    println("Pontos em ordem decrescente: $c $b $a")
    val soma = a + b + c
    if (soma > 100) println("Média: %.2f".format(java.util.Locale.ROOT, soma / 3.0))
    else println("Equipe desclassificada")
}
