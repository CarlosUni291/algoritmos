package algoritmos.grupo100a109.algoritmo108

fun main() {
    print("Digite nome: ")
    val nome = readln()
    val prenome = nome.substringBefore(' ')
    if (prenome == "JOSÉ" || prenome == "José" || prenome == "josé") println(nome)
}
