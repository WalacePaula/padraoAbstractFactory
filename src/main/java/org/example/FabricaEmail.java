package org.example;

public class FabricaEmail implements NotificacaoFabrica{
    @Override
    public IMensagem createMensagem(String mensagem) {
        return new MensagemEmail(mensagem);
    }

    @Override
    public ICanalDeEnvio createCanalDeEnvio() {
        return new CanalEmail();
    }
}
