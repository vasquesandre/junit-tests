package br.dio;

import java.util.logging.Logger;

public class ConexaoBD {

    public static final Logger LOGGER = Logger.getLogger(ConexaoBD.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Conexao bem sucedida");
    }

    public static void finalizarConexao() {
        LOGGER.info("Conexao finalizada");
    }

    public static void insereDados(Pessoa pessoa) {
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("removeu dados");
    }

}
