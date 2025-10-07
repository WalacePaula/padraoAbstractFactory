package org.example;

public class MensagemSMS implements IMensagem{
    private final String mensagem;

    public MensagemSMS(String mensagem) {
        this.mensagem = mensagem;
    }
    @Override
    public String conteudo() {
        return "Mensagem de um SMS: " + mensagem;
    }
}
