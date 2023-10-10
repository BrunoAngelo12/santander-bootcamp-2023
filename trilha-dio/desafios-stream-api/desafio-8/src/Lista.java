import java.util.Arrays;
import java.util.List;

public class Lista {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Lista() {
    }

    @Override
    public String toString() {
        return "Lista [numeros=" + numeros + "]";
    }

    public void somarElementos(){
        int soma = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("A soma dos elementos da lista é = " + soma);
    }
    
}
