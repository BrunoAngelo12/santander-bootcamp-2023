import java.util.Arrays;
import java.util.List;

public class Lista {
    List<Integer> numeros = Arrays.asList(1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Lista(){
    }

    @Override
    public String toString() {
        return "Lista [numeros=" + numeros + "]";
    }

    public void verificarNumeros(){
        boolean numerosPositivos = numeros.stream().allMatch(n -> n > 0);
        if(numerosPositivos){
            System.out.println("Todos os números são possitivos");
        }else{
            System.out.println("Pelo menos um não é positivo");
        }
    }
}
