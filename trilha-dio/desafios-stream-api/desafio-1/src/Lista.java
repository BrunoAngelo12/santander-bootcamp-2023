import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lista {
    List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Lista() {
    }

    @Override
    public String toString() {
        return "Lista [numeros=" + numeros + "]";
    }
    
    public List<Integer> ordemNumerica(){
        List<Integer> listaPorOrdemNumericaCrescente = new ArrayList<>(numeros);
        Collections.sort(listaPorOrdemNumericaCrescente);
        return listaPorOrdemNumericaCrescente;
    }

}
