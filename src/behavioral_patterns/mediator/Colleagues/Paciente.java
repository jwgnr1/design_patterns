package behavioral_patterns.mediator.Colleagues;

import behavioral_patterns.mediator.mediator.MediatorClinica;

public class Paciente extends Setor{

    public Paciente(MediatorClinica mediator){
        super(mediator);
    }

    @Override
    public void receberSolicitacao(String solicitacao) {
        System.out.println("Paciente recebeu solicitacao: " + solicitacao);
    }

}
