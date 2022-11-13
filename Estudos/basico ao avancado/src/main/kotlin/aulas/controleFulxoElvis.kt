package aulas

fun main(){
    //logica normal
    var string: String? = null
    if(string == null){
        println("Nulo")
    }else{
        println(string)
    }

    //operador elvis
    println(string ?: "Nulo")
}