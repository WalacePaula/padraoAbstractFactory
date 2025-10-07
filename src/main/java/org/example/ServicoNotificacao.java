package org.example;

public class ServicoNotificacao {
    private final IMensagem msg;
    private final ICanalDeEnvio canal;

    public ServicoNotificacao(NotificacaoFabrica fabrica, String mensagem) {
        this.msg = fabrica.createMensagem(mensagem);
        this.canal = fabrica.createCanalDeEnvio();
    }

    public String notificar() {
        return this.canal.enviar(this.msg);
    }

    public static void main(String[] args) {
        NotificacaoFabrica fabricaEmail = new FabricaEmail();
        String mensagemEmail = "Olá, esta é uma notificação por email!";
        ServicoNotificacao servicoEmail = new ServicoNotificacao(fabricaEmail, mensagemEmail);
        servicoEmail.notificar();

        System.out.println(" ");

        NotificacaoFabrica fabricaSMS = new FabricaSMS();
        String mensagemSMS = "Olá, esta é uma notificação por SMS!";
        ServicoNotificacao servicoSMS = new ServicoNotificacao(fabricaSMS, mensagemSMS);
        servicoSMS.notificar();
    }

}
