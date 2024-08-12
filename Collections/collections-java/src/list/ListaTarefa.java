package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {   
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasARemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasARemover);

    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();

        }
    public void obterDescricaoTarefas() {
        
            System.out.println(tarefaList);
        }
        public static void main(String[] args) {
            ListaTarefa listaTarefa = new ListaTarefa();

            listaTarefa.adicionarTarefa("Estudar Java");

            System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.adicionarTarefa("Estudar Python");
            
            System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.removerTarefa("Estudar Java");

            System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.adicionarTarefa("Estudar Python");
            listaTarefa.adicionarTarefa("Estudar Java");
            listaTarefa.adicionarTarefa ("Estudar Python");

            listaTarefa.obterDescricaoTarefas();
        }
    }



