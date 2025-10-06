package org.example;

public class MensagemEmail implements IMensagem{

    @Override
    public String conteudo() {
        return "Mensagem de um email";
    }
}
