import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(new Integer(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer l : listaNumeros){
            soma += l;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        Integer maiorNumero = -999999999;
        for(Integer l : listaNumeros){
            if (l >= maiorNumero){
                maiorNumero = l;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        Integer menorNumero = 999999999;
        for (Integer l : listaNumeros){
            if (l <= menorNumero){
                menorNumero = l;
            }
        }
        return menorNumero;
    }

    @Override
    public String toString() {
        return "SomaNumeros [listaNumeros=" + listaNumeros + "]";
    }

    public List<Integer> exibirNumeros(){
        return listaNumeros;
    }

       
}
