package behavioral_patterns.command.commands;


import behavioral_patterns.command.model.GerenciadorTarefas;
import behavioral_patterns.command.model.Tarefa;

public class AdicionarTarefaCommand implements Command {

    private GerenciadorTarefas gerenciadorTarefas;
    private Tarefa tarefa;

    public AdicionarTarefaCommand(GerenciadorTarefas gerenciadorTarefas, Tarefa tarefa){
        this.gerenciadorTarefas = gerenciadorTarefas;
        this.tarefa = tarefa;
    }

    @Override
    public void execute() {
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
        gerenciadorTarefas.addTarefa(tarefa);
    }

    @Override
    public void undo() {
        System.out.println("Tarefa " + gerenciadorTarefas.getListaTarefas().get(-1).getDescricao());
        gerenciadorTarefas.getListaTarefas().remove(-1);
    }
}
