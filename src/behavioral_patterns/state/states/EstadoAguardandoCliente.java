package behavioral_patterns.state.states;


import behavioral_patterns.state.interfaces.EstadoChamando;
import behavioral_patterns.state.model.Chamado;

public class EstadoAguardandoCliente implements EstadoChamando {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("O atendimento já foi iniciado");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Já está aguardando o cliente");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Resposta obtida: Enviando o cliente para o atendimento");
        chamado.setEstadoAtual(new EstadoEmAtendimento());
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possivel resolver enquanto aguarda o cliente");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println(chamado.toString() + "\nCancelado\n");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
