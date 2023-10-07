public class Aluno {
    private String aluno;
    private String matricula;
    private Double nota;
    
    public Aluno(String aluno, String matricula, Double nota) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno [aluno=" + aluno + ", matricula=" + matricula + ", nota=" + nota + "]";
    }
   
}
