package behavioral_patterns.state.states;

import behavioral_patterns.state.interfaces.EstadoChamando;
import behavioral_patterns.state.model.Chamado;

public class EstadoEmAtendimento implements EstadoChamando {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("O atendimento já foi iniciado!");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Aguardando cliente...");
        chamado.setEstadoAtual(new EstadoAguardandoCliente());
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("A resposta do cliente ainda não foi solicitada");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println(chamado.toString() + "\nResolvido\n");
        chamado.setEstadoAtual(new EstadoResolvido());
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println(chamado.toString() + "\nCancelado\n");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
