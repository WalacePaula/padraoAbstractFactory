package org.example;

public class MensagemSMS implements IMensagem{
    @Override
    public String conteudo() {
        return "Mensagem de um SMS";
    }
}
