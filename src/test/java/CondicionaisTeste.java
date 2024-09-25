import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "andre.vasques")
    void validarSomenteNoUsuarioAndre() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "andre.vasques")
    void validarSomenteNoUsuarioAndre2() {
        Assertions.assertEquals(20, 10 + 10);
    }

    //Another ones
    /*
    * @EnabledOnOs(OS.LINUX)
    * @EnabledOnOs({OS.LINUX, OS.MAC})
    * @EnabledOnJre(JAVA_21)
    * @EnabledForJreRange(min = JAVA_17, max = JAVA_22)*/

}
