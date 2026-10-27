package behavioral_patterns.command;


import behavioral_patterns.command.commands.*;
import behavioral_patterns.command.invoker.PainelControle;
import behavioral_patterns.command.model.GerenciadorTarefas;
import behavioral_patterns.command.model.Tarefa;
import interfaces.PadraoExecutor;

public class CommandExecutor implements PadraoExecutor {
    public void executar() {

        PainelControle painelControle = new PainelControle();
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

        Tarefa tarefa1 = new Tarefa("Estudar Command");
        Tarefa tarefa2 = new Tarefa("Implementar Exercício");

        painelControle.executarComando(new AdicionarTarefaCommand(gerenciadorTarefas, tarefa1));
        painelControle.executarComando(new AdicionarTarefaCommand(gerenciadorTarefas, tarefa2));
        painelControle.executarComando(new ConcluirTarefaCommand(gerenciadorTarefas, tarefa1, 0));

        painelControle.desfazerUltimoComandoo();

        Tarefa tarefa4 = new Tarefa("Revisar Observer");
        Tarefa tarefa5 = new Tarefa("Estudar Chain of Responsibility");
        Tarefa tarefa6 = new Tarefa("Implementar exercício");

        painelControle.adicionarNaFila(new AdicionarTarefaCommand(gerenciadorTarefas, tarefa4));
        painelControle.adicionarNaFila(new AdicionarTarefaCommand(gerenciadorTarefas, tarefa5));
        painelControle.adicionarNaFila(new ConcluirTarefaCommand(gerenciadorTarefas, tarefa2, 1));

        painelControle.processarFila();

        gerenciadorTarefas.exibirListaTarefas();
    }
}