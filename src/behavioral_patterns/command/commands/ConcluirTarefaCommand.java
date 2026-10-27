package behavioral_patterns.command.commands;


import behavioral_patterns.command.model.GerenciadorTarefas;
import behavioral_patterns.command.model.Tarefa;

public class ConcluirTarefaCommand implements Command {

    private GerenciadorTarefas gerenciadorTarefas;
    private int posicao;
    private Tarefa tarefa;
    private final String ANSI_BOLD = "\u001B[1m";
    private final String ANSI_RESET = "\u001B[0m";

    public ConcluirTarefaCommand(GerenciadorTarefas gerenciadorTarefas, Tarefa tarefa, int posicao){
        this.gerenciadorTarefas = gerenciadorTarefas;
        this.tarefa = tarefa;
        this.posicao = posicao;
    }

    @Override
    public void execute() {
        gerenciadorTarefas.concluirTarefaPosicao(posicao);
        System.out.println("Tarefa concluida: " + tarefa.getDescricao());
    }

    @Override
    public void undo() {
        gerenciadorTarefas.getListaTarefas().get(posicao).setConcluida(false);
        System.out.println("Tarefa: " +  ANSI_BOLD + gerenciadorTarefas.getListaTarefas().get(posicao).getDescricao() + ANSI_RESET + " voltou para não concluida\n");
    }
}
