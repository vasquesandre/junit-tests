import br.dio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    void validaObjetoNulo() {

        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("andre", LocalDateTime.now());

        Assertions.assertNotNull(pessoa);

    }

    @Test
    void validaTipoNumerosDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);

    }

}
