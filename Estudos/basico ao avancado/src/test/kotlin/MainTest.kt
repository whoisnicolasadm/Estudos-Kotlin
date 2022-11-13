import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest{
    @Test
    @DisplayName("Funcao soma de teste")
    fun testSoma(){
        Assertions.assertAll(
            {Assertions.assertEquals(soma(10, 10), 20)}
        )
    }
}
