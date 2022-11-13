package aulas

import kotlin.math.pow

fun main(){
    //perimetro do retangulo
    println(rect(5f, 10.3f))
    //volume do cubo
    println(cube(5f))
    //area do triangulo
    println(tri(5f, 6.5f))
    //substituir caracteres em uma string
    var frase: String = "Nicolas Alexandre Torres Dias e um cara muito lindo"
    println(string(frase))
}

fun cube(altura: Float): Float{
    var cube: Float = altura.pow(3)
    return cube
}

fun rect(altura: Float, largura: Float): Float{
    var rect: Float = (altura * 2) + (largura * 2)
    return rect
}

fun tri(base: Float, altura: Float): Float{
    var triangle = (base * altura) / 2
    return triangle
}

fun string(frase: String): String {
    return frase.replace("n", "o", true)
        .replace("a", "b", true)
        .replace("c", "d", true)
        .replace("e", "f", true)
        .replace("m", "o", true)
        .replace("d", "e", true)
        .replace("i", "j", true)
        .replace("r", "s", true)
        .replace("l", "m", true)
}