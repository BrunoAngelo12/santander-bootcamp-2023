import java.util.Arrays;
import java.util.List;

public class Lista {
    List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Lista() {
    }

    @Override
    public String toString() {
        return "Lista [numeros=" + numeros + "]";
    }

    public void verificarMaiorQue10(){
        boolean verificacao = numeros.stream().anyMatch(n -> n > 10);
        if(verificacao){
            System.out.println("Há pelo menos 1 número maior que 10");
        }else{
            System.out.println("Não há números maiores que 10");
        }
    }
}
