public class Item {
    public String nome;
    private double preço;
    private int quantidade;

    public Item(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public static void main(String[] args) {
        CarrinhoDeCompras lista = new CarrinhoDeCompras();
        System.out.println("total de elementos: " + lista.obterNumeroDeItensDoCarrinho());

        Item salgadin = new Item("Salgadinho", 1.50, 2);
        lista.adicionarItem(salgadin);
        System.out.println("total de elementos: " + lista.obterNumeroDeItensDoCarrinho());
        Item salgadin2 = new Item("Salgadinho de queijo", 2.50, 1);
        lista.adicionarItem(salgadin2);
        System.out.println("total de elementos: " + lista.obterNumeroDeItensDoCarrinho());
        //lista.removerItem("Salgadinho");
        //System.out.println("total de elementos: " + lista.obterNumeroDeItensDoCarrinho());
        System.out.printf("Valor total do carrinho: R$ %.2f", lista.calcularValorTotal());
        System.out.println();
        lista.exibirItens();
    }

}
