import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lista {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

    public Lista() {
    }

    @Override
    public String toString() {
        return "Lista [numeros=" + numeros + "]";
    }
    
    public boolean verificarNumeros(){
        Set<Integer> listaSet = new HashSet<>(numeros);
        boolean verificacao;
        if(listaSet.size() != numeros.size()){
            verificacao = true;
        }else{
            verificacao = false;
        }
        return verificacao;        
    }

}
