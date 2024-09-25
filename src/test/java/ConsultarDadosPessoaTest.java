import br.dio.ConexaoBD;
import br.dio.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexao() {
        ConexaoBD.iniciarConexao();
    }

    @BeforeEach
    void insereDadosTeste() {
        ConexaoBD.insereDados(new Pessoa("andre", LocalDateTime.now()));
    }

    @AfterEach
    void removeDadosTeste() {
        ConexaoBD.removeDados(new Pessoa("andre", LocalDateTime.now()));
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizaConexao() {
        ConexaoBD.finalizarConexao();
    }

}
