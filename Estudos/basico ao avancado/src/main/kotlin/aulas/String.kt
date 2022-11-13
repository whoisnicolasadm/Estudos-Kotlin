package aulas

fun main(){

    var string: String = "Nicolas"
    var _string: String = "Nick"
    var string_:String = "Nicolas Dias"


    var nome: String = "Nicolas Alexandre Torres Dias"
    var _nome: String = "$nome"

    println(_nome.length)
    println(_nome[0])
    println(_nome.replace("a", "X"))
    println(_nome.uppercase())
    println(_nome.lowercase())

    //se o numero for 0, as string sao iguais, numero negativo a string passada primeira tem menos caracteres,
    // se for positivo a string passada primeiro tem mais caracteres

    println(_string.compareTo(string))
    println(string.compareTo(_string))
    println(string.compareTo(string_))
}