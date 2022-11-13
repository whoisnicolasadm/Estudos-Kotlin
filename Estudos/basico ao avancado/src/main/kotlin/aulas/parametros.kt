package aulas

fun main(){
    endereco(cidade = "BH", rua = "Ivan Lins", num = 850, estado = "MG", cep = "31260020")
    print(media(/*params do abc*/false,
        /*params do vararg*/7.7f, 8.4f, 5f, 9.6f, "", false))

    arrayOf(1, 3, 45, 2345, false, 345f)
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", num: Int = 0){

}

fun <T, J> media(abc: J, vararg notas: T): Float{
    var soma: Float = 0f

    for(n in notas){
       if(n is Float){
           soma += n
       }
    }
    return (soma/notas.size)
}