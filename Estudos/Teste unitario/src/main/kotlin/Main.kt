fun main() {
    println("Seja bem vindo ao conversor de unidades: ")
    println("Digite [1] para converter USD para BRL")
    println("Digite [2] para converter Milhas para Quilometros")
    println("Digite [3] para converter Kg para G")

    val value: Int = readLine()!!.toInt()
    var medida: Float

    if(value == 1){
        println("Digite quantos USD para converter: ")
        medida = readLine()!!.toFloat()
        println(calc(medida , value))
    }else if(value == 2){
        println("Digite quantas Milhas para converter: ")
        medida = readLine()!!.toFloat()
        println(calc(medida , value))
    }else if(value == 3){
        println("Digite quantos Kg para converter: ")
        medida = readLine()!!.toFloat()
        println(calc(medida , value))
    }else{
        println("Desculpe, nao entendi ;-;")
    }


}

fun calc(medida: Float, value: Int): Float{
    var medida1: Float = medida
    when(value){
        1 -> medida1 * 5.18
        2 -> medida1 * 1
        3 -> medida1 * 1000
        else -> medida1 * 0
    }
    return medida1
}
