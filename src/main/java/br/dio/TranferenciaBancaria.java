package br.dio;

public class TranferenciaBancaria {

    public void tranfere(Conta conta, Conta contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }

}
