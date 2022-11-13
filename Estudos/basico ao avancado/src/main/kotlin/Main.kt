fun main(){

    //TIPOD DE VARIAVEIS

    var string: String = "Nicolas";
    var int: Int = 16;
    var char: Char = 'N'
    var float: Float = 10f
    var double: Double = 10.0
    var boolean: Boolean = false
    var short: Short = 10
    var byte: Byte = 10
    var long: Long = 10L

    println("Double Max = ${Double.MAX_VALUE} - Min ${Double.MIN_VALUE}")
    println("Int Max = ${Int.MAX_VALUE} - Min ${Int.MIN_VALUE}")
    println("Float Max = ${Float.MAX_VALUE} - Min ${Float.MIN_VALUE}")
    println("Short Max = ${Short.MAX_VALUE} - Min ${Short.MIN_VALUE}")
    println("Byte Max = ${Byte.MAX_VALUE} - Min ${Byte.MIN_VALUE}")
    println("Long Max = ${Long.MAX_VALUE} - Min ${Long.MIN_VALUE}")


    val uint: UInt = 10u
    val ushort: UShort = 10u
    val ulong: ULong = 10u
    val ubyte: UByte = 10u

    //VAL - nao pode ter se valor alterado
    //VAR - pode ter seu valor alterado


    //Formatacao de string

    val nome: String = "Nicolas"
    val sobrenome: String = "Dias"

    println("Ola, $nome $sobrenome")
    println("${nome.length}")


    //OPERADORES ARITMETICOS

    var idade: Int = 10
    idade += 1 // idade = 11
    idade -= 1 //idade = 10
    idade *= 2 // idade = 20
    idade /= 2 // idade = 10

    var calc = 10%3 // calc = 1

    println(idade)


    println("A soma entre 10 e 5 e igual a: ${soma(10, 5)}")


    val y: UInt = 30u
    if(y >=18u){
        println("Voce e maior de idade")
    }else if(y < 18u){
        println("Voce e menor de idade")
    }else{
        println("Que idade e essa?")
    }


    //Operadores de fluxo

    //   ||: or  &&: and

    //range

    val n: Int = 4

    if(n <= 1 || n <= 50){
        println("N esta entre 1 e 50")
    }else{
        println("N nao esta entre 1 e 50")
    }

    if(n in 1..50){
        println("N esta entre 1 e 50")
    }else{
        println("N nao esta entre 1 e 50")
    }


    for(i in 1..10 step 2){
        print("$i ")
    }

    for(j in 10 downTo 0 /*step 2*/){
        print("$j ")
    }

    val str: String = "Nicolas e lindo"
    for(char in str){
        print("$char")
    }

    var num: Int = 10
    while (num > 0){
        println("Nicolas Lindo")
        num--   //faz decremento ate a condicao se tronar falsa (num++) faz incremento
    }

    val nomeNicolas: String = "Nicolas"

    do{
        println("Qual e seu nome: ")
        var nomeNicolas2: String = readLine()!!.toString()
    }while (nomeNicolas2 != nomeNicolas)



    val rect = Rect(5.0f, 8.3f)
    print(rect.perimeter)


}

open class Shape

class Rect(var height: Float, var lenght: Float): Shape() {
    var perimeter: Float = (height*2) + (lenght*2)
}

fun soma(a: Int, b: Int): Int{
    return (a + b)
}