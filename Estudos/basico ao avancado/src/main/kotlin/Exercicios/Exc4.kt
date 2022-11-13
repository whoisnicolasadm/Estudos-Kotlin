package Exercicios

fun main(){
    for(i in 1..50){
        print("$i ")
    }

    println(" ")

    for(i in 50 downTo 1){
        print("$i ")
    }

    println(" ")

    for(i in 1..50 step 5){
        print("$i ")
    }

    println(" ")

    for(i in 1 .. 50){
        var result:Int = 0
        var expression = i%5

        if(expression != result){
            print("$i ")

        }else{

        }
    }

    println(" ")

    var soma: Int = 0
    for(i in 0..500){
        soma+=i
    }
    print("$soma")


    println(" ")

    var caixa: Float = 2000f
    val balao: Float = 7f



}

