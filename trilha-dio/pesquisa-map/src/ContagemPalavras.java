import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavras.isEmpty()){
            this.contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras);
    }

    public Integer encontrarPalavraMaisFrequente(){
        Integer palavraMaisFrequente = null;
        Integer contagem = Integer.MIN_VALUE;
        if(!contagemPalavras.isEmpty()){
            for(Integer c : contagemPalavras.values()){
                if(c >= contagem){
                    palavraMaisFrequente = c;
                }
            }
        }
        return palavraMaisFrequente;
    }

    public Map<String, Integer> getContagemPalavras() {
        return contagemPalavras;
    }

    public static void main(String[] args) {
        ContagemPalavras colecao = new ContagemPalavras();
        colecao.adicionarPalavra("Palavra 1", 23);
        colecao.adicionarPalavra("Palavra 2", 78);
        colecao.adicionarPalavra("Palavra 3", 65);
        colecao.adicionarPalavra("Palavra 4", 123);
        colecao.adicionarPalavra("Palavra 5", 431);
        colecao.adicionarPalavra("Palavra 6", 987);
        colecao.exibirContagemPalavras();
        colecao.removerPalavra("Palavra 4");
        colecao.exibirContagemPalavras();
        System.out.println(colecao.encontrarPalavraMaisFrequente());
    }
    

}
