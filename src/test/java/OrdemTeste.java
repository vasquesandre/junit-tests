import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // colocar o @Order(i)
//@TestMethodOrder(MethodOrderer.MethodName.class) - executa na ordem do nome dos métodos
//@TestMethodOrder(MethodOrderer.Random.class) - executa aleatoriamente
//@TestMethodOrder(MethodOrderer.DisplayName.class) - executa na ordem do @DisplayName em ordem alfabetica
public class OrdemTeste {

    //@DisplayName("A")
    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    //@DisplayName("B")
    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    //@DisplayName("C")
    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    //@DisplayName("D")
    @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }

}
