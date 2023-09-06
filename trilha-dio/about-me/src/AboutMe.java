public class AboutMe {
    public static void main(String[] args) throws Exception {
        /*exercicio para demonstrar input de dados sem a classe Scanner do java */
        String nome = args[0];
        String sobrenome = args[1];
        String idade = args[2];
        String altura = args[3];

        System.out.println("Olá, me chamo " + nome + " " + sobrenome +  " tenho " + idade + " anos e " + altura + " de altura");
    }
}
