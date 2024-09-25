import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarSomenteNoUsuarioAndre() {
        Assumptions.assumeTrue("andre.vasques".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }

}
