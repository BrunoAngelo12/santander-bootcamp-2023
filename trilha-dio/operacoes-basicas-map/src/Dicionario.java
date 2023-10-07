import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        this.dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPorPesquisa = null;
        if(!dicionario.isEmpty()){
            palavraPorPesquisa = dicionario.get(palavra);
        }
        return palavraPorPesquisa;
    }

    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Maçã", "Fruta que vem da macieira");
        dicionario.adicionarPalavra("Banana", "Fruta que vem da bananeira");
        dicionario.adicionarPalavra("Abacaxi", "Fruta que vem da terra");
        dicionario.adicionarPalavra("Maçã", "Fruta que colhemos da macieira");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("Abacaxi");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Maçã"));
    }
    
}
