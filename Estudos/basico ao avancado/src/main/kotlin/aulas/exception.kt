package aulas

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main(){
    try{
        var s: String? = null
        println(s!!.length)

        val a = 10/0
        println(a)
    }catch (e: NullPointerException){
        //println(e)
        println("Variavel nula")
    }catch (e: ArithmeticException){
        //print(e)
        println("Calculo impossivel")
    }catch (e: Exception){
        //println(e)
        println("Algum erro inesperado aconteceu")
    }
    println("Fim.")
}