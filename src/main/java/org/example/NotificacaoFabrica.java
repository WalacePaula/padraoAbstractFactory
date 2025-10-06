package org.example;
import org.example.IMensagem;
import org.example.ICanalDeEnvio;

public interface NotificacaoFabrica {
    IMensagem createMensagem();
    ICanalDeEnvio createCanalDeEnvio();
}
