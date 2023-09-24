package apps;
public class Telegram extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Telegram: Enviando mensagem...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Telegram: Recebendo mensagem...");
        salvarHistoricoMensagem();
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Telegram: Salvando o histórico");        
    }
    
}
