public class app {
    public static void main(String[] args) {
        SomaNumeros objeto = new SomaNumeros();
        objeto.adicionarNumero(1);
        objeto.adicionarNumero(2);
        objeto.adicionarNumero(-4);
        objeto.adicionarNumero(0);
        System.out.println(objeto.toString());
        System.out.println("soma: " + objeto.calcularSoma());
        System.out.println("maior numero: " + objeto.encontrarMaiorNumero());
        System.out.println("menor numero: " + objeto.encontrarMenorNumero());
        System.out.println();
        System.out.println(objeto.exibirNumeros());
    }
    
}
