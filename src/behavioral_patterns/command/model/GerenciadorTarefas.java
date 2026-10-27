package behavioral_patterns.command.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas{

    private List<Tarefa> listaTarefas = new ArrayList<>();

    public void addTarefa(Tarefa tarefaNova){
        listaTarefas.add(tarefaNova);
    }

    public void removerUltimaTarefa(){
        String ultimaTarefaDescricao = listaTarefas.get(listaTarefas.size() -1).getDescricao();
        listaTarefas.remove(listaTarefas.size() - 1);
    }

    public void conluirTarefaDescricao(String descricao){
        for(Tarefa e: listaTarefas){
            if(e.getDescricao().equalsIgnoreCase(descricao)){
                e.setConcluida(true);
            }
        }
    }

    public void concluirTarefaPosicao(int posicao){
        for(int i = 0; i < listaTarefas.size(); i++){
            if(i == posicao){
                listaTarefas.get(i).setConcluida(true);
            }
        }
    }

    public void tarefaNaoConcluida(int posicao){
        for(int i = 0; i < listaTarefas.size(); i++){
            if(i == posicao){
                listaTarefas.get(i).setConcluida(false);
            }
        }
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void exibirListaTarefas(){
        System.out.println("\n===== Exibindo Tarefas =====");
        int numero = 0;
        for (Tarefa e: listaTarefas){
            System.out.println((numero + 1) + ". " + "Tarefa: " + e.getDescricao() + " | " + (e.isConcluida()? "☑" : "☐"));
            numero ++;
        }
        System.out.println("============================\n");
    }
}
