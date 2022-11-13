fun main(){
    print("Digite o texto para criptografar: ")
    var textToEncript: String = readLine()!!.toString()
    println(encript(textToEncript))

}
fun encript(text: String): String{

    text.replace("A", "X", true)
        .replace("B", "X", true)
        .replace("C", "X", true)
        .replace("D", "X", true)
        .replace("E", "X", true)
        .replace("F", "X", true)
        .replace("G", "X", true)
        .replace("H", "X", true)
        .replace("I", "X", true)
        .replace("J", "X", true)
        .replace("K", "X", true)
        .replace("L", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)
        .replace("A", "X", true)


    return
}