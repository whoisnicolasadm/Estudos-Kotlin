package Exercicios

fun main(){
    println("Digite o valor do lado 1: ")
    var lado1: Int = readLine()!!.toInt()

    println("Digite o valor do lado 2: ")

    var lado2: Int = readLine()!!.toInt()

    println("${lado(lado1, lado2)}")


    println("Digite o lado 1: ")
    var lado4: Int = readLine()!!.toInt()
    println("Digite o lado 2: ")
    var lado5: Int = readLine()!!.toInt()
    println("Digite o lado 3: ")
    var lado6: Int = readLine()!!.toInt()

    println(triangulo(lado4, lado5, lado6))
}

fun lado(lado1: Int, lado2: Int): String{
    var frase: String
    if(lado1 != lado2){
        frase = "Nao e um quadrado"
    }else{
        frase = "E um quadrado"
    }
    return frase
}

fun triangulo(lado4: Int, lado5: Int, lado6: Int): String{
    var mensagem: String
    if(lado4 != lado5 && lado5 != lado6 && lado4 != lado6){
        mensagem = "Nao e um triangulo equilatero"
    }else{
        mensagem = "E um triangulo equilatero"
    }
    return mensagem
}