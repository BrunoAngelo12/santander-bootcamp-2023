public class Aluno {
    private String aluno;
    private Long matricula;
    private Double nota;
    
    public Aluno(String aluno, Long matricula, Double nota) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno [aluno=" + aluno + ", matricula=" + matricula + ", nota=" + nota + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    
   
}
