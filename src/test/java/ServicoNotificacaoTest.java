import org.example.FabricaEmail;
import org.example.FabricaSMS;
import org.example.NotificacaoFabrica;
import org.example.ServicoNotificacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoNotificacaoTest {
    @Test
    void enviarNotificacaoPorEmail() {
        NotificacaoFabrica notificacaoFabrica = new FabricaEmail();
        String mensagemEmail = "Olá, esta é uma notificação por email!";
        var servicoNotificacao = new ServicoNotificacao(notificacaoFabrica, mensagemEmail);
        assertEquals("Enviando mensagem de Email: Mensagem de um email: " + mensagemEmail, servicoNotificacao.notificar());
    }

    @Test
    void enviarNotificacaoPorSMS() {
        NotificacaoFabrica notificacaoFabrica = new FabricaSMS();
        String mensagemSMS = "Olá, esta é uma notificação por SMS!";
        var servicoNotificacao = new ServicoNotificacao(notificacaoFabrica, mensagemSMS);
        assertEquals("Enviando mensagem de SMS: Mensagem de um SMS: " + mensagemSMS, servicoNotificacao.notificar());
    }
}
