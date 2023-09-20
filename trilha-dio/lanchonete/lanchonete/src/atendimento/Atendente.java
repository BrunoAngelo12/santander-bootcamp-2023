package atendimento;

public class Atendente {
    private void passarPedido(){
        System.out.println("Pedido novo!!");
    }

    public void agradecerPedido(){
        passarPedido();
        System.out.println("Obrigado pelo pedido senhor!");
    }

    public void entregarPedido(){
        System.out.println("O pedido está pronto, aqui está !");
    }

}