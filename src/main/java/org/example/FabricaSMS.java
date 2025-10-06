package org.example;

public class FabricaSMS implements NotificacaoFabrica{
    @Override
    public IMensagem createMensagem() {
        return new MensagemSMS();
    }

    @Override
    public ICanalDeEnvio createCanalDeEnvio() {
        return new CanalSMS();
    }
}
