package cliente;

public class Cliente {
    public void solicitarLanche(){
        System.out.println("Desejo um lanche!");
    }

    private void consultarSaldo(){
        System.out.println("Consultando saldo..");
    }

    protected void pagarPedido(){
        consultarSaldo();
        System.out.println("Pagamento no débito!");
    }
}
