fun main(){
    var a: String = "Nicolas Alexandre Torres Dias"
    println(replace(a))

    var ano: Long = 2
    println(tempo(ano))

    var frase: String = "Nicolas"
    println(caracteres(frase))

    var n: Int = 4
    println(cubo(n))

    var milha: Float = 1f
    println(milhas(milha))
}

fun cubo(n: Int): Int {
    var value: Int = n*n*n
    return value
}

fun replace(a: String): String{
    return a.replace("a", "x").replace("A", "x")
}

fun tempo(ano: Long): String{
    var meses: Long = ano*12
    var dias: Long = ano*365
    var horas: Long = ano*365*24
    var minutos: Long = horas*60
    var segundo: Long = minutos*60

    var frase: String = "2 anos equivalem a: $meses meses, $dias dias, $horas horas, $minutos minutos, $segundo segundos."

    return frase
}

fun caracteres(frase: String): Int{
    var qtd: Int = frase.length

    return qtd
}

fun milhas(milha: Float): Float{
    var value: Float = milha*1.6f
    return value
}

