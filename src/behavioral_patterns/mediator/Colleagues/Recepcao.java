package behavioral_patterns.mediator.Colleagues;

import behavioral_patterns.mediator.mediator.MediatorClinica;

public class Recepcao extends Setor {

    public Recepcao(MediatorClinica mediator){
        super(mediator);
    }

    @Override
    public void receberSolicitacao(String solicitacao) {
        System.out.println("Recepção recebeu solicitacao: " + solicitacao);
    }
}
