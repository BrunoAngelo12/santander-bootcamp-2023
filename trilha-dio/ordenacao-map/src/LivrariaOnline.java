import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline{
    private Map<String, Livro> listaLivros;

    public LivrariaOnline() {
        this.listaLivros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        listaLivros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!listaLivros.isEmpty()){
            for(var l : listaLivros.entrySet()){
                if(l.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    listaLivros.remove(l.getKey());
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> livrosPorPreco = new TreeMap<>(new ComparadorDePreco());
        return livrosPorPreco;
    }

    public void exibir(){
        System.out.println(listaLivros);
    }

    public static void main(String[] args) {
        LivrariaOnline map = new LivrariaOnline();
        map.adicionarLivro("www.amazon.com/livro1", "Pai rico e pai pobre", "Bruno Angelo", 27.90);
        map.adicionarLivro("www.amazon.com/livro2", "O patinho feio", "Bruno Angelo", 30.90);
        map.adicionarLivro("www.amazon.com/livro3", "Jesus o maior psicologo", "Bruno Angelo", 14.90);
        //map.exibir();
        //map.removerLivro("Pai rico e pai pobre");
        //map.exibir();
        System.out.println(map.exibirLivrosOrdenadosPorPreco());
    }

    public class ComparadorDePreco implements Comparator<Livro>{

        @Override
        public int compare(Livro l1, Livro l2) {
            return Double.compare(l1.getPreco(), l2.getPreco());
        }


    }
    
}
