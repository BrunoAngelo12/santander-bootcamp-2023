import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        listaNumeros = new ArrayList<>();
    }

    @Override
    public int compareTo(Integer n) {
        return 0;
    }
    
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaNumeroAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaNumeroAscendente);
        return listaNumeroAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaNumeroDescendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaNumeroDescendente, Collections.reverseOrder());
        return listaNumeroDescendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros [listaNumeros=" + listaNumeros + "]";
    }
    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();
        lista.adicionarNumero(3);
        lista.adicionarNumero(4);
        lista.adicionarNumero(1);
        lista.adicionarNumero(5);
        lista.adicionarNumero(2);

        System.out.println("imprimindo a lista criada: ");
        System.out.println(lista);

        System.out.println();
        System.out.println("ordem ascendente: ");
        System.out.println(lista.ordenarAscendente());

        System.out.println();
        System.out.println("ordem descendente: ");
        System.out.println(lista.ordenarDescendente());
    }
}

