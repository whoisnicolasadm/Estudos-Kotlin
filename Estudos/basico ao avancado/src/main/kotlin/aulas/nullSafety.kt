package aulas

fun main(){
    //Quando a variavel pode ou nao ser nula, caso for, o codigo continua rodadndo
    var a: String? = null
    println(a?.length)
    println("Nicolas")

    //Quando a variavel pode ou nao ser numa, mas caso for, o codigo para
    var s: String? = null
    println(s!!.length)
    println("Nicolas")

}