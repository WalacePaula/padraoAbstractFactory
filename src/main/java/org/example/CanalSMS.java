package org.example;

public class CanalSMS implements ICanalDeEnvio{
    @Override
    public String enviar(IMensagem mensagem) {
       return "Enviando mensagem de SMS: " + mensagem.conteudo();
    }
}
