package algoritmos.grupo080a089.algoritmo87

fun main() {
    print("Qual a capital do Brasil?: ")
    val resposta = readln()
    if (resposta == "BRASÍLIA" || resposta == "Brasília") {
        println("PARABÉNS!")
    } else if (resposta.lowercase() in listOf("brasília", "brazília", "brasilia", "brazilia")) {
        println("CERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}
