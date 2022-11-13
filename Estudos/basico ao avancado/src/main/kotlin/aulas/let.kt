package aulas

fun main(){
    //forma convencional
    var string: String? = null
    if(string != null){
        string.lowercase()
        string.length
    }

    //usando Let

    string?.let{
        it.lowercase()
        it.length
    }
}