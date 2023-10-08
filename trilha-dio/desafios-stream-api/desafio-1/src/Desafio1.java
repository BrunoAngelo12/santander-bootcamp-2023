public class Desafio1 {
    public static void main(String[] args){
        //Desafio 1: Mostre a lista na ordem numérica:
        Lista lista = new Lista();
        System.out.println("Lista original: " + lista.toString());
        System.out.println();
        System.out.println("Lista na ordem numérica: " + lista.ordenarListaDeFormaCrescente());
    }

}
