package org.example;

public class CanalEmail implements ICanalDeEnvio{

    @Override
    public String enviar(IMensagem mensagem) {
       return "Enviando mensagem de Email: " + mensagem.conteudo();
    }
}
