package Exercicios

import kotlin.math.pow

fun main(){
    var salario: Float = 10000f
    val investimentoAna: Float = 0.02f
    val investimentoPaula: Float = 0.08f
    var i: Int = 0
    do {
        var montanteAna = 50*(i*investimentoAna)+100+10000
        var montantePaula = 50*(i*investimentoPaula)+10000

        println("Ana: $montanteAna --------- Paula: $montantePaula")

        i++
    }while (montanteAna > montantePaula)
    println(i)


}