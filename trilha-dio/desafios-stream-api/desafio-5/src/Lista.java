import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Lista() {
    }

    @Override
    public String toString() {
        return "Lista [numeros=" + numeros + "]";
    }

    public int calcularMediaMaioresQue5(){
        List<Integer> maioresQue5 = numeros.stream().filter(n -> n > 5).toList();
        int media = maioresQue5.stream().mapToInt(Integer::intValue).sum();
        media = media / (int) maioresQue5.size();
        return media;
    }
}
