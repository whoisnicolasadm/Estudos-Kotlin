import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.roundToInt

fun portaria(idade: Int, tpConvite: String, cod: String): String {
    if (idade < 18) {
        return "Negado."
    }

    if (tpConvite != "") {
        val tipoConvite = tpConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            return "Negado."
        }

        if (cod != "") {
            val codigo = cod.lowercase()
            return if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                "Welcome."
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")) {
                "Welcome."
            } else {
                "Negado."
            }
        }
    }
    return "Negado."
}

fun trapezio(Bma: Float, Bme: Float, h: Float): Any {

    if(Bma == Bme){
        return "Isto nao sao parametros de um trapezio"
    }
    val area = (Bme + Bma) * h / 2

    return area
}

fun juros(c: Float, i: Float, t: Int): Float {
    val m = c * (1 + i).pow(t)
    return String.format("%.2f", m).toFloat()
}