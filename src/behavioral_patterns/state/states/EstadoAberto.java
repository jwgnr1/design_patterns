package behavioral_patterns.state.states;


import behavioral_patterns.state.interfaces.EstadoChamando;
import behavioral_patterns.state.model.Chamado;

public class EstadoAberto implements EstadoChamando {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Iniciando atendimento...");
        chamado.setEstadoAtual(new EstadoEmAtendimento());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("O atendimento ainda será iniciado");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("O atendimento ainda será iniciado");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("O atendimento ainda será iniciado");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println(chamado.toString() + "\nCancelado\n");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
