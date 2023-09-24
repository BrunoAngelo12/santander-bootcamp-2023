public class FacebookMessenger extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Facebook Messenger: Enviando mensagem...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook Messenger: Recebendo mensagem...");
    }
    
}
