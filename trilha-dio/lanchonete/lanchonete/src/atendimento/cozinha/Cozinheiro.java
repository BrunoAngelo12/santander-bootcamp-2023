package atendimento.cozinha;

public class Cozinheiro {
    
    public void prepararLanche(Almoxarifado cleitin){       
        solicitarIngredientes(cleitin);
        cleitin.trocarGas();
        System.out.println("Cozinheiro: Preparando o lanche...");
    }

    private void solicitarIngredientes(Almoxarifado cleitin){
        cleitin.abastecerIngredientes();
    }

}
