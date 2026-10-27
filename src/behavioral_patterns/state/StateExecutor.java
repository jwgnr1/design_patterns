package behavioral_patterns.state;

import behavioral_patterns.state.model.Chamado;
import interfaces.PadraoExecutor;

public class StateExecutor implements PadraoExecutor {
    public void executar() {

        Chamado chamado = new Chamado("12345", "Problema com o cartão", "João Pedro");

        chamado.resolver();

        chamado.iniciarAtendimento();

        chamado.aguardarCliente();

        chamado.resolver();

        chamado.responderCliente();

        chamado.resolver();

        chamado.cancelar();

        Chamado chamado2 = new Chamado("67890", "Pagar Fatura do Cartão", "Maria José");

        chamado2.cancelar();

        chamado2.iniciarAtendimento();
    }
}