import br.dio.Conta;
import br.dio.TranferenciaBancaria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("7890123", 100);

        TranferenciaBancaria tranferenciaBancaria = new TranferenciaBancaria();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            tranferenciaBancaria.tranfere(contaOrigem, contaDestino, -1));

        Assertions.assertDoesNotThrow(() -> tranferenciaBancaria.tranfere(contaOrigem, contaDestino, 20));
    }

}
