import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoDeMensagemInstatanea;
import apps.Telegram;

public class MeuComputador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("msn / fcb / tlg: ");
        String app = sc.nextLine();
        ServicoDeMensagemInstatanea application = null;

        if(app.equals ("msn")){
            application = new MSNMessenger();
        }else if(app.equals("fcb")){
            application = new FacebookMessenger();
        }else{
            application = new Telegram();
        }
        application.enviarMensagem();
        application.receberMensagem();
    }
}
