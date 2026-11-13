package algoritmos.grupo120a129.algoritmo121

fun main() {
    print("Digite n1: ")
    val n1 = readln().trim().toInt()
    print("Digite n2: ")
    val n2 = readln().trim().toInt()
    print("Digite n3: ")
    val n3 = readln().trim().toInt()
    print("Digite n4: ")
    val n4 = readln().trim().toInt()
    print("Digite n5: ")
    val n5 = readln().trim().toInt()
    if (n1 == n2 || n1 == n3 || n1 == n4 || n1 == n5 || n2 == n3 || n2 == n4 || n2 == n5 || n3 == n4 || n3 == n5 || n4 == n5) {
        println("Os valores devem ser diferentes")
        return
    }
    var maior = if (n1 > n2) n1 else n2
    var menor = if (n1 < n2) n1 else n2
    if (n3 > maior) maior = n3 else if (n3 < menor) menor = n3
    if (n4 > maior) maior = n4 else if (n4 < menor) menor = n4
    if (n5 > maior) maior = n5 else if (n5 < menor) menor = n5
    println("Maior: $maior")
    println("Menor: $menor")
}
