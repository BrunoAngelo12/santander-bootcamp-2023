package atendimento;

public class Atendente {
    private void passarPedido(){
        System.out.println("Atendente para cozinha: Pedido novo!!");
    }

    public void agradecerPedido(){
        passarPedido();
        System.out.println("Atendente: Obrigado pelo pedido senhor!");
    }

    public void entregarPedido(){
        System.out.println("Atendente: O pedido está pronto, aqui está !");
    }

}