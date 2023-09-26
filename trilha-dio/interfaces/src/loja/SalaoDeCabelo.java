package loja;

import produtos.condicionador.Condicionador;
import produtos.condicionador.JohnsonsBaby;
import produtos.creme.Creme;
import produtos.creme.Elseve;
import produtos.hidratacao.Hidratacao;
import produtos.shampoo.GiovannaBaby;
import produtos.shampoo.Shampoo;

public class SalaoDeCabelo {
    public static void main(String[] args) throws Exception {
        Condicionador condicionador = new JohnsonsBaby();
        condicionador.nutrirCabelo();

        Shampoo giovanna = new GiovannaBaby();
        giovanna.limparCabelo();

        Creme elseve = new Elseve();
        elseve.hidratarCabelo();

        Hidratacao hidratacao = new Hidratacao();
        condicionador = hidratacao;
        
        Creme creme = hidratacao;
        Shampoo shampoo = hidratacao;

        condicionador.nutrirCabelo();
        creme.hidratarCabelo();
        shampoo.limparCabelo();

    }
}
