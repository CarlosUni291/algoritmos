package algoritmos.grupo010a019.algoritmo19

import kotlin.math.*

fun main() {
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${round(exp(0.5 * ln(64.0))).toInt()}")
    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")
    println("%.3f".format(java.util.Locale.ROOT, sin(45 * PI / 180) + 0.0001))
    println("potência com exp e log e formatar: %.3f".format(java.util.Locale.ROOT, floor((exp(3 * ln(8.0)) + 0.001) * 1000) / 1000))
    println("potência com exp e log sem formatar: ${exp(3 * ln(8.0))}")
    println("potência com operador e formatar: %.3f".format(java.util.Locale.ROOT, 8.0.pow(3)))
    println("raiz cúbica: ${exp(ln(8.0) / 3)}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${round(5.5).toInt()}")
    println("convertendo para inteiro 6.5: ${round(6.5).toInt()}")
    println("convertendo para inteiro 6.5 + 0.0001: ${round(6.5 + 0.0001).toInt()}")
    println("convertendo para inteiro 5.45: ${round(5.45).toInt()}")
    println("convertendo para inteiro 5.51: ${round(5.51).toInt()}")
    println("convertendo para real 87: ${87.toDouble()}")
    println("convertendo para int 3/4: ${round(3.0 / 4).toInt()}")
}
