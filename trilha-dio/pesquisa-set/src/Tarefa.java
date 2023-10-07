public class Tarefa {
    private String descricao;
    private Boolean tarefaCompleta;

    public Tarefa(String descricao, Boolean tarefaCompleta){
        this.descricao = descricao;
        this.tarefaCompleta = tarefaCompleta;
    }

    

    public void setTarefaCompleta(Boolean tarefaCompleta) {
        this.tarefaCompleta = tarefaCompleta;
    }



    public String getDescricao() {
        return descricao;
    }

    public Boolean getTarefaCompleta() {
        return tarefaCompleta;
    }

    @Override
    public String toString() {
        return "{" + this.descricao + ", " + this.tarefaCompleta + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    public static void main(String[] args) {
        ListaTarefas sTarefas = new ListaTarefas();
        sTarefas.adicionarTarefa("teste", false);
        sTarefas.adicionarTarefa("teste 2", true);
        /*System.out.println(sTarefas.toString());
        sTarefas.removerTarefa("teste");
        System.out.println(sTarefas.toString());
        sTarefas.adicionarTarefa("teste");
        System.out.println(sTarefas.toString());
        sTarefas.exibirTarefas();
        System.out.println(sTarefas.contarTarefas());
        System.out.println(sTarefas.obterTarefasConcluidas());
        System.out.println(sTarefas.obterTarefasPendentes());*/
        sTarefas.marcarTarefaConcluida("teste");
        sTarefas.exibirTarefas();
        sTarefas.marcarTarefaPendente("teste");
        sTarefas.exibirTarefas();
    }

}
