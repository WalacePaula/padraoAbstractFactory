package org.example;

public class CanalSMS implements ICanalDeEnvio{
    @Override
    public void enviar(IMensagem mensagem) {
        System.out.println("Enviando mensagem de um SMS: " + mensagem.conteudo());
    }
}
