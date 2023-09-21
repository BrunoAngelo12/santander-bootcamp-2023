package cliente;
import atendimento.Atendente;
import atendimento.cozinha.Almoxarifado;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        Almoxarifado almox = new Almoxarifado();
        Atendente atendente = new Atendente();


        Cliente cliente = new Cliente();
        cliente.perguntarCardapio();
        
        System.out.println("Cardápio:");
        for(LanchesEnum nomeLanche : LanchesEnum.values()){
            System.out.println(nomeLanche.getNomeLanche());
        }

        cliente.solicitarLanche();

        atendente.agradecerPedido();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.prepararLanche(almox);

        atendente.entregarPedido();
        cliente.pagarPedido();
    }
}
