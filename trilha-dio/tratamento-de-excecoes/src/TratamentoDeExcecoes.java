import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try{
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite sua altura: ");
            double altura = sc.nextDouble();
            System.out.println("Seu nome é " + nome + " " + sobrenome + " idade de " + idade + " anos " + " e a altura é " + altura);    
        }catch(InputMismatchException e){
            System.out.println("Erro: tipos de dados inseridos não compatíveis, para dados numéricos utilize números, e para números quebrados utilize o ponto '.' ");
        }finally{
            sc.close();
        }
    }
}
