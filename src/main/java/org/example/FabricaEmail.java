package org.example;

public class FabricaEmail implements NotificacaoFabrica{
    @Override
    public IMensagem createMensagem() {
        return new MensagemEmail();
    }

    @Override
    public ICanalDeEnvio createCanalDeEnvio() {
        return new CanalEmail();
    }
}
