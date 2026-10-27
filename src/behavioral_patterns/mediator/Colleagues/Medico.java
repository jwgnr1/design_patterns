package behavioral_patterns.mediator.Colleagues;

import behavioral_patterns.mediator.mediator.MediatorClinica;

public class Medico extends Setor {

    public Medico(MediatorClinica mediator) {
        super(mediator);
    }

    @Override
    public void receberSolicitacao(String solicitacao) {
        System.out.println("Médico recebeu solicitacao: " + solicitacao);
    }
}
