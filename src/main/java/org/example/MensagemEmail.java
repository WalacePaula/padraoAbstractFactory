package org.example;

public class MensagemEmail implements IMensagem{
    private final String mensagem;

    public MensagemEmail(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String conteudo() {
        return "Mensagem de um email: " + mensagem;
    }
}
