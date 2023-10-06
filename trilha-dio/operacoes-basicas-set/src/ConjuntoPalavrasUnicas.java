import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> colecaoPalavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        colecaoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        colecaoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        colecaoPalavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        boolean verificacaoDePresenca = false;
        for(String colecao : colecaoPalavrasUnicas){
            if(colecao.equalsIgnoreCase(palavra)){
                verificacaoDePresenca = true;
            }
        }
        return verificacaoDePresenca;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(colecaoPalavrasUnicas);
    }

}
