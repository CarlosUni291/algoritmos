package algoritmos.grupo070a079.algoritmo71

fun main() {
    print("Digite hora: ")
    val hora = readln().trim().toInt()
    print("Digite minuto: ")
    val minuto = readln().trim().toInt()
    val totalMinutos = hora * 60 + minuto
    println("Até agora se passaram $totalMinutos minutos")
}
