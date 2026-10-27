package behavioral_patterns.command.invoker;


import behavioral_patterns.command.commands.Command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PainelControle {

    private Stack<Command> historico = new Stack<>();
    private Queue<Command> filaComando = new LinkedList<>();

    public void executarComando(Command command){
        command.execute();
        historico.push(command);
    }

    public void desfazerUltimoComandoo(){
        if(!historico.isEmpty()){
            System.out.println("\nDesfazendo...");
            Command ultimo = historico.pop();
            ultimo.undo();
        } else {
            System.out.println("Nada para desfazer");
        }
    }

    public void adicionarNaFila(Command command){
        System.out.println("Comando adicionado");
        filaComando.add(command);
    }

    public void processarFila(){
        System.out.println("\nProcessando fila...\n");
        while (!filaComando.isEmpty()){
            Command command = filaComando.poll();
            command.execute();
            historico.push(command);
        }
    }
}
