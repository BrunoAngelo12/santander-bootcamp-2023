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

    public void removerItem(Item item){
        String descricao = item.getNome();
        for(Item x : carrinho){
            if (x.getNome() == descricao){
                carrinho.remove(item);
            }
        }
    }

}

