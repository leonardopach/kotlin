import org.junit.jupiter.api.*

class MainTest {

    @Test
    fun testIfElse() {
        Assertions.assertTrue(maiordeIdade(23))
        Assertions.assertFalse(maiordeIdade(17))
    }
    @Test
    @DisplayName("Teste método xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXD("xxoo")) },
            { Assertions.assertTrue(countXD("xXoo")) },
            { Assertions.assertTrue(countXD("xOxo")) },
            { Assertions.assertTrue(countXD("xxOO")) })
    }

    @Test
    @Disabled
    fun naoImplementado() {
    }

    @Test
    @Disabled
    fun vaiFalhar() {
        fail { "Não posso terminar os teste sem esse método" }
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXD("xxoo"))
        assertThrows<NullPointerException>{abc()}
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }
}