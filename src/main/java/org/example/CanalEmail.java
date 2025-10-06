package org.example;

public class CanalEmail implements ICanalDeEnvio{

    @Override
    public void enviar(IMensagem mensagem) {
        System.out.println("Enviando mensagem de Email: " + mensagem.conteudo());
    }
}
