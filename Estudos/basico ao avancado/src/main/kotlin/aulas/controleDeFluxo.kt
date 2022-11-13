package aulas

fun main(){
    var i: Int = 0
    do{
        println("i e menor que 3")
        i++
    }while (i <= 3)

    println("")

    var j: Int = 0
    while(j <= 3){
        println("j e menor que 3")
        j++
    }

    println("")


    for(k in 10 downTo 0 step 2){
        println(k)
    }

    var numero: Int = 120
    if(numero >= 29){
        println("O numero e maior que 29")
    }else if(numero == 120){
        println("O numero e igual a $numero")
    }else{
        println("O numero e menor que 29")
    }

    var _numero: Int = 100
    when(_numero){
        10 -> println("O numero e 10")
        100 -> println("O numero e 100")
        1000 -> println("O numero e 1000")
        else -> println("Nao sei que numero e esse :(")
    }
}