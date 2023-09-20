package cliente;
import atendimento.Atendente;
import atendimento.cozinha.Almoxarifado;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        Almoxarifado almox = new Almoxarifado();

        Cliente cliente = new Cliente();
        cliente.solicitarLanche();
        
        Atendente atendente = new Atendente();
        atendente.agradecerPedido();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.prepararLanche(almox);

        atendente.entregarPedido();
        cliente.pagarPedido();
    }
}
