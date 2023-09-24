package apps;
public class FacebookMessenger extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Facebook Messenger: Enviando mensagem...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook Messenger: Recebendo mensagem...");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Facebook Messenger: Salvando o histórico");
    }
    
}
