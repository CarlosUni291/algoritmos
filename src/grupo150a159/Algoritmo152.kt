package algoritmos.grupo150a159.algoritmo152

fun main() {
    print("Peso em kg: ")
    val peso = readln().trim().replace(',', '.').toDouble()
    print("Idade: ")
    val idade = readln().trim().toInt()
    if (peso < 5) {
        println("Não pode tomar o remédio porque não tem peso. Consulte um médico.")
        return
    }
    val miligramas = if (idade >= 12) {
        if (peso >= 60) 1000 else 875
    } else {
        when {
            peso <= 9 -> 125
            peso <= 16 -> 250
            peso <= 24 -> 375
            peso <= 30 -> 500
            else -> 750
        }
    }
    val miligramasPorGota = 500.0 / 20
    val gotas = miligramas / miligramasPorGota
    println("Tomar ${gotas.toInt()} gotas por dose")
}
