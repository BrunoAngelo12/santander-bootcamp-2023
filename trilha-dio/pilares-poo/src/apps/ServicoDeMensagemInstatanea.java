package apps;
public abstract class ServicoDeMensagemInstatanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Verificando conexão com a internet..");
    }
    
    protected abstract void salvarHistoricoMensagem();        
    
    
}
