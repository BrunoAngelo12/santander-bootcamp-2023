import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<Item>();
    }

    public int obterNumeroDeItensDoCarrinho(){
        return this.carrinho.size();
    }

    public void adicionarItem(Item item){
        carrinho.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();//criado uma lista com os itens para serem removidos atraves do metodo removeAll que remove com base em outra coleção
        for(Item c : carrinho){//for each para percorrer todo o carrinho de compras
            if(c.getNome().equalsIgnoreCase(nome)){//comparando para ver se tem os nomes são iguais
                itensParaRemover.add(c);//caso o nome do item que queremos remover seja igual ao item da lista, é adicionado na lista dos itens que serão removidos
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotalDoCarrinho = 0.0;
        double calculo = 0.0;
        for(Item c : carrinho){
            calculo = c.getPreço() * c.getQuantidade();
            valorTotalDoCarrinho += calculo;
        }
        return valorTotalDoCarrinho;
    }

    public void exibirItens(){
       System.out.println("- Lista do Carrinho -");
        for (Item c : carrinho){
            System.out.printf("Produto: %s, Preço: R$%.2f, Quantidade: %d \n", c.getNome(), c.getPreço(), c.getQuantidade());
       }
    }

}

