package cliente;

public class Cliente {
    public void solicitarLanche(){
        LanchesEnum lanche = LanchesEnum.X_BURGUER;
        perguntarAcompanhamento();
        lanche.mostrarAcompanhamentos();
        System.out.println("Cliente: Desejo um lanche " + lanche.getNomeLanche());
    }

    private void consultarSaldo(){
        System.out.println("Cliente: Consultando saldo..");
    }

    protected void pagarPedido(){
        consultarSaldo();
        System.out.println("Cliente: Pagamento no débito!");
    }

    protected void perguntarCardapio(){
        System.out.println("Cliente: Quais os lanches disponiveis? ");
    }

    protected void perguntarAcompanhamento(){
        System.out.println("Cliente: Quais os acompanhamentos ?");
    }
}
