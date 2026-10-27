package behavioral_patterns.command.commands;


import behavioral_patterns.command.model.GerenciadorTarefas;
import behavioral_patterns.command.model.Tarefa;

public class RemoverUltimaTarefaCommand implements Command {

    private GerenciadorTarefas gerenciadorTarefas;
    private Tarefa ultimaTarefaRemovida;
    private Tarefa tarefa;

    public RemoverUltimaTarefaCommand(GerenciadorTarefas gerenciadorTarefas, Tarefa tarefa){
        this.gerenciadorTarefas = gerenciadorTarefas;
        this.tarefa = tarefa;
    }

    @Override
    public void execute() {
        ultimaTarefaRemovida = gerenciadorTarefas.getListaTarefas().get(-1);
        System.out.println("Tarefa removida: " + ultimaTarefaRemovida.getDescricao());
        gerenciadorTarefas.removerUltimaTarefa();
    }

    @Override
    public void undo() {
        System.out.println("Tarefa restaurada: " + ultimaTarefaRemovida.getDescricao());
        gerenciadorTarefas.addTarefa(ultimaTarefaRemovida);
    }
}
