import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        listaNumeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    @Override
    public int compareTo(Integer o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
