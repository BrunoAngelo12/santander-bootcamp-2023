/**Exercicio TvSmart
     * @autor Bruno
     */
public class SmartTv{    
    Boolean ligada = false;
    Integer canal = 1;
    Integer volume = 25;


    public SmartTv(){
    }
    /** Este método é para ligar a tv */
    public void ligarTv(){
        this.ligada = true;
    }

    public void desligarTv(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        System.out.println("+1 volume");
        this.volume++;
    }

    public void diminuirVolume(){
        System.out.println("-1 volume");
        this.volume--;
    }

    public void aumentarCanal(){
        this.canal++;
    }

    public void diminuirCanal(){
        this.canal--;
    }

    public void mudarCanal(int canal){
        this.canal = canal;
    }

}