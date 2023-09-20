package atendimento.cozinha;

public class Almoxarifado {
    
    private void darSaidaEstoque(){
        System.out.println("Dando a saída de itens");
    }

    protected void trocarGas(){
        System.out.println("Trocando o gás");
    }

    protected void abastecerIngredientes(){
        darSaidaEstoque();
        System.out.println("Abastecendo ingredientes");
    }
}
