package org.example;

public class FabricaSMS implements NotificacaoFabrica{
    @Override
    public IMensagem createMensagem(String mensagem) {
        return new MensagemSMS(mensagem);
    }

    @Override
    public ICanalDeEnvio createCanalDeEnvio() {
        return new CanalSMS();
    }
}
