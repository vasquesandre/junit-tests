import br.dio.Pessoa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void calcularIdadeCorretamente() {
        Pessoa andre = new Pessoa("andre", LocalDateTime.of(2004, 2, 2, 12, 30, 0));
        Assertions.assertEquals(20, andre.getIdade());
    }

    @Test
    void retornaMaiorDeIdade() {
        Pessoa andre = new Pessoa("andre", LocalDateTime.of(2004,2,2,12,30,0));
        Assertions.assertTrue(andre.maiorDeIdade());

        Pessoa joao = new Pessoa("joao", LocalDateTime.of(2009,6,6,15,24,12));
        Assertions.assertFalse(joao.maiorDeIdade());
    }

}