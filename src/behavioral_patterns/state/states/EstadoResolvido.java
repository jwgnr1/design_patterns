package behavioral_patterns.state.states;

import behavioral_patterns.state.interfaces.EstadoChamando;
import behavioral_patterns.state.model.Chamado;

public class EstadoResolvido implements EstadoChamando {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("O atendimento " + chamado.getCodigo() + " já foi resolvido!");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("O atendimento " + chamado.getCodigo() + " já foi resolvido!");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("O atendimento " + chamado.getCodigo() + " já foi resolvido!");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("O atendimento " + chamado.getCodigo() + " já foi resolvido!");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("O atendimento " + chamado.getCodigo() + " já foi resolvido!");
    }
}
