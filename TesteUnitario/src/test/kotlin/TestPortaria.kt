import org.junit.jupiter.api.*

class TestPortaria {

    @Test
//    @Disabled
    @DisplayName("teste os cenarios portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(23, "comum", "xt"), "Welcome.")
        Assertions.assertEquals(portaria(23, "premium", "xl"), "Welcome.")
        Assertions.assertEquals(portaria(23, "luxo", "xl"), "Welcome.")
        Assertions.assertEquals(portaria(23, "luxo", "xt"), "Negado.")
        Assertions.assertEquals(portaria(23, "", ""), "Negado.")
        Assertions.assertEquals(portaria(17, "", ""), "Negado.")
        Assertions.assertEquals(portaria(19, "outro", ""), "Negado.")

    }

    @Test
    fun testMenorDeIdade() {
        Assertions.assertEquals("Negado.", portaria(17, "comum", "xt123"))
    }

    @Test
    fun testTipoConviteInvalido() {
        Assertions.assertEquals("Negado.", portaria(20, "invalido", "xt123"))
    }

    @Test
    fun testCodigoInvalido() {
        Assertions.assertEquals("Negado.", portaria(20, "comum", "invalido"))
    }

    @Test
    fun testConviteComumCodigoValido() {
        Assertions.assertEquals("Welcome.", portaria(20, "comum", "xt123"))
    }

    @Test
    fun testConvitePremiumCodigoValido() {
        Assertions.assertEquals("Welcome.", portaria(20, "premium", "xl456"))
    }

    @Test
    fun testConviteLuxoCodigoValido() {
        Assertions.assertEquals("Welcome.", portaria(20, "luxo", "xl789"))
    }

    @Test
    fun testFuncaoPortariaInvalida() {
        Assertions.assertEquals("Negado.", portaria(18, "", ""))
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

    // Teste do Main
    @Test
    fun testMaiorDeIdadeMain() {
        Assertions.assertTrue(maiordeIdade(18))
    }

    @Test
    fun testMenorDeIdadeMain() {
        Assertions.assertFalse(maiordeIdade(16))
    }

    @Test
    fun testAbcMain() {
        assertThrows<NullPointerException> { abc() }
    }
}