package teste

fun main(){

    println("Digite o cargo: ")
    var cargo: String = readLine()!!.toString()
    println("Digite o tempo de experiencia: ")
    var tempo: Int = readLine()!!.toInt()
    println(bonus(cargo, tempo))

}

fun bonus(cargo: String, tempo: Int): Float{
    var bonus: Float = 0f
    if(cargo == "Gerente" && tempo < 2){
        bonus = 2000f
    }else if(cargo == "Gerente" && tempo >= 2){
        bonus = 3000f
    }

    else if(cargo == "Coordenador" && tempo < 1){
        bonus = 1500f
    }else if(cargo == "Coordenador" && tempo >= 1){
        bonus = 1800f
    }

    else if(cargo == "Engenheiro"){
        bonus = 1000f
    }

    else if(cargo == "Estagiario"){
        bonus = 500f
    }

    else{
        bonus = 0f
    }


    return bonus
}
