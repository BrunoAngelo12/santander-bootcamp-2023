import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos implements Comparable{
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for(Aluno a : listaAlunos){
            if(a.getMatricula().equals(matricula)){
                alunoParaRemover = a;
            }
        }
        listaAlunos.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> AlunosPorNome = new TreeSet<>(listaAlunos);
        return AlunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(listaAlunos);
        return alunoPorNota;
    }

    public void exibirAlunos(){
        System.out.println(listaAlunos);
    }

    public class ComparatorPorNota implements Comparator<Aluno>{

        @Override
        public int compare(Aluno a1, Aluno a2) {
            return Double.compare(a1.getNota(), a2.getNota());
        }

    }

    public static void main(String[] args) {
        GerenciadorAlunos listaAluno = new GerenciadorAlunos();
        listaAluno.adicionarAluno("Bruno", 123L, 5.0);
        listaAluno.adicionarAluno("Bello", 123L, 5.0);
        listaAluno.adicionarAluno("Sandy", 124L, 10.0);
        listaAluno.adicionarAluno("Lara", 125L, 7.0);
        //listaAluno.exibirAlunos();
        //listaAluno.removerAluno(124L);
        listaAluno.exibirAlunosPorNome();
    }

    /*@Override
    public int compareTo(Object a) {
        a.
    }*/
    
}
