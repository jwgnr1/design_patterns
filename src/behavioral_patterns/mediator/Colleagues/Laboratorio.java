package behavioral_patterns.mediator.Colleagues;

import behavioral_patterns.mediator.mediator.MediatorClinica;

public class Laboratorio extends Setor{

    public Laboratorio(MediatorClinica mediator){
        super(mediator);
    }

    @Override
    public void receberSolicitacao(String solicitacao) {
        System.out.println("Laboratorio recebeu solicitacao: " + solicitacao);

    }
}
