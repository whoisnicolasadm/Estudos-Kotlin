package aulas.OrientacaoObjetos

class Pessoa(val anoNascimento: Int, var nome: String){

    var olhos: String = ""

    fun dormir(){
        olhos = "Fechados"
        println("Fui dormir, meus olhos estao " + olhos)
    }

    fun acordar(){
        olhos = "Abertos"
        println("Acordei, meus olhos estao " + olhos)
    }

}

fun main(){
    // class - comportamentos e atributos

    var pessoa: Pessoa = Pessoa(2006, "Nicolas")
    println(pessoa.nome)
    pessoa.acordar()
    pessoa.dormir()
}