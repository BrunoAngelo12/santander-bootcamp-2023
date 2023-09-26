package produtos.hidratacao;

import produtos.condicionador.Condicionador;
import produtos.creme.Creme;
import produtos.shampoo.Shampoo;

public class Hidratacao implements Condicionador, Shampoo, Creme {
    public void hidratarCabelo() {
        System.out.println("Nutrindo através de hidratação");
    }

    public void limparCabelo() {
        System.out.println("Limpando o cabelo através de hidratação");
    }

    public void nutrirCabelo() {
        System.out.println("Hidratando o cabelo através de hidratação");
    }
}
