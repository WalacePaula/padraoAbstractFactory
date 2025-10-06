package org.example;

public class ServicoNotificacao {
    private final IMensagem mensagem;
    private final ICanalDeEnvio canal;

    public ServicoNotificacao(NotificacaoFabrica fabrica) {
        this.mensagem = fabrica.createMensagem();
        this.canal = fabrica.createCanalDeEnvio();
    }

    public void notificar() {
        this.canal.enviar(this.mensagem);
    }

    public static void main(String[] args) {
        NotificacaoFabrica fabricaEmail = new FabricaEmail();
        ServicoNotificacao servicoEmail = new ServicoNotificacao(fabricaEmail);
        servicoEmail.notificar();

        System.out.println(" ");

        NotificacaoFabrica fabricaSMS = new FabricaSMS();
        ServicoNotificacao servicoSMS = new ServicoNotificacao(fabricaSMS);
        servicoSMS.notificar();
    }

}
