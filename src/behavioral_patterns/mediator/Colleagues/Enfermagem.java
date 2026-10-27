package behavioral_patterns.mediator.Colleagues;

import behavioral_patterns.mediator.mediator.MediatorClinica;

public class Enfermagem extends Setor{

    public Enfermagem(MediatorClinica mediator){
        super(mediator);
    }

    @Override
    public void receberSolicitacao(String solicitacao) {
        System.out.println("Enfermagem recebeu solicitacao: " + solicitacao);
    }
}
