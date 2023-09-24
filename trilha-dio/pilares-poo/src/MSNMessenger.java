public class MSNMessenger extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        System.out.println("MSN Messenger: Enviando mensagem...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("MSN Messenger: Recebendo mensagem...");
    }        

}
