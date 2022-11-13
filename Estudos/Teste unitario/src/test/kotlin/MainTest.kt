import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import java.lang.Exception
import java.lang.NullPointerException

class MainTest {
    @Test
    @DisplayName("Portaria")
    fun portaria(){
        Assertions.assertAll(
            //Acesso negado

            { assertEquals(portaria(20, "comum", "xl"), "Negado.") },
            { assertEquals(portaria(20, "premium", "xt"), "Negado.") },
            { assertEquals(portaria(20, "luxo", "xt"), "Negado.") },
            { assertEquals(portaria(15, "comum", "xl"), "Negado.") },
            { assertEquals(portaria(15, "premium", "xt"), "Negado.") },
            { assertEquals(portaria(15, "luxo", "xt"), "Negado.") },
            { assertEquals(portaria(18, "lsdfuxo", "xl67896789"), "Negado.") },
            { assertEquals(portaria(15, "comumsdf", "xt68796789"), "Negado.") },
            { assertEquals(portaria(15, "premiusdfm", "xl67896789"), "Negado.") },
            { assertEquals(portaria(15, "lsdfuxo", "xl67896789"), "Negado.") },
            { assertEquals(portaria(18, "", ""), "Negado.") },
            { assertEquals(portaria(15, "", ""), "Negado.") },

            //Acesso permitido

            { assertEquals(portaria(20, "comum", "xt"), "Welcome.") },
            { assertEquals(portaria(20, "premium", "xl"), "Welcome.") },
            { assertEquals(portaria(20, "luxo", "xl"), "Welcome.") },
            { assertEquals(portaria(18, "comum", "xt"), "Welcome.") },
            { assertEquals(portaria(18, "premium", "xl"), "Welcome.") },
            { assertEquals(portaria(18, "luxo", "xl"), "Welcome.") },
        )
    }

    @Test
    @DisplayName("Funcao calcular area do trapezio")
    fun trap(){
        assertEquals(trapezio(10f, 10f, 5f), "Isto nao sao parametros de um trapezio")
        assertEquals(trapezio(10f, 5f, 5f), 37.5f)
        assertEquals(trapezio(5f, 10f, 5f), 37.5f)
    }

    @Test
    @DisplayName("Calcular juros compostos")
    fun calc(){
        assertEquals(juros(1000f, 0.2f, 4), 2073.60f)
        assertEquals(juros(1000f, 0f, 4), 1000.0f)
    }
}