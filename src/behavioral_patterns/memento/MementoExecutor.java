package behavioral_patterns.memento;

import behavioral_patterns.memento.Caretaker.HistoricoDocumento;
import behavioral_patterns.memento.memento.MementoDocumento;
import behavioral_patterns.memento.originator.Documento;
import interfaces.PadraoExecutor;

import java.time.LocalDateTime;

public class MementoExecutor implements PadraoExecutor {
    public void executar() {

        Documento documento = new Documento("Prova", "Questão 1", "João",
                LocalDateTime.now(), 1);
        HistoricoDocumento historico = new HistoricoDocumento();

        documento.mostrarEstado();
        historico.adicionarVersao(documento.salvar());

        documento.setConteudo("Alternativa a");
        System.out.println("Conteudo alterado\n");
        historico.adicionarVersao(documento.salvar());

        documento.setConteudo("Diário");
        System.out.println("Conteudo alterado\n");

        documento.mostrarEstado();

        MementoDocumento ultimaVersao = historico.ultimaVersao();
        documento.restaurar(ultimaVersao);

        ultimaVersao = historico.ultimaVersao();
        documento.restaurar(ultimaVersao);

    }
}