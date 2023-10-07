import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefas;
    
    public ListaTarefas(){
        this.setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, Boolean tarefaCompleta){
        setTarefas.add(new Tarefa(descricao, tarefaCompleta));
    }

    @Override
    public String toString() {
        return "ListaTarefas [setTarefas=" + setTarefas + "]";
    }

    public void removerTarefa(String descricao){
        for(Tarefa t : setTarefas){
            Tarefa tarefaParaRemover = null;
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                setTarefas.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(setTarefas);
    }

    public int contarTarefas(){
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : setTarefas){
            if(t.getTarefaCompleta().equals(true)){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : setTarefas){
            if(t.getTarefaCompleta().equals(false)){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : setTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaCompleta(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : setTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaCompleta(false);
            }
        }
    }

}
