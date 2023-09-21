package atendimento.cozinha;

public class Almoxarifado {
    
    private void darSaidaEstoque(){
        System.out.println("Almoxarifado: Dando a saída de itens");
    }

    protected void trocarGas(){
        System.out.println("Almoxarifado: Trocando o gás");
    }

    protected void abastecerIngredientes(){
        darSaidaEstoque();
        System.out.println("Almoxarifado: Abastecendo ingredientes");
    }
}
