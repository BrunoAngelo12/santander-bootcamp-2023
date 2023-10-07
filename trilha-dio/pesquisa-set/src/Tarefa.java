public class Tarefa {
    private String descricao;
    private Boolean tarefaCompleta;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.tarefaCompleta = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getTarefaCompleta() {
        return tarefaCompleta;
    }

    @Override
    public String toString() {
        return "{" + descricao + ", " + tarefaCompleta + "}";
    }

}
