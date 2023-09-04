public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo a SmartTv");
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        smartTv.ligarTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.desligarTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);  

    }
}
