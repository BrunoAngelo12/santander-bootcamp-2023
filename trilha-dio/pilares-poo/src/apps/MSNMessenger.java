package apps;
public class MSNMessenger extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("MSN Messenger: Enviando mensagem...");
        salvarHistoricoMensagem();
        }

    @Override
    public void receberMensagem() {
        System.out.println("MSN Messenger: Recebendo mensagem...");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("MSN Messenger: Salvando o histórico");
    }        

}
