package behavioral_patterns.memento.Caretaker;

import behavioral_patterns.memento.memento.MementoDocumento;

import java.util.Stack;

public class HistoricoDocumento {

    private Stack<MementoDocumento> historico = new Stack<>();

    public void adicionarVersao(MementoDocumento versao){
        historico.push(versao);
    }

    public MementoDocumento ultimaVersao(){
        if (!historico.empty()){
            return historico.pop();
        }
        System.out.println("Sem versões para restaurar");
        return null;
    }
}
