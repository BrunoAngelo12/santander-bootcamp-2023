public class MSNMessenger {
    
    public void enviarMensagem(){
        validarConectadoInternet();        
        System.out.println("Enviando mensagem.."); 
        salvarHistoricoInternet();       
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem..");        
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado à internet..");        
    }

    private void salvarHistoricoInternet(){
        System.out.println("Salvando o histórico da conversa..");        
    }

}
