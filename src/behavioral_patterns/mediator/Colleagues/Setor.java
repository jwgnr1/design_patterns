package behavioral_patterns.mediator.Colleagues;

import behavioral_patterns.mediator.mediator.MediatorClinica;

public abstract class Setor {

    protected MediatorClinica mediator;

    public Setor(MediatorClinica mediator){
        this.mediator = mediator;
    }

    public void enviarSolicitacao(String solicitacao){
        System.out.println("Enviando solicitação -> " + solicitacao);
        mediator.enviarSolicitacao(solicitacao + "\n", this);
    }

    public abstract void receberSolicitacao(String solicitacao);

}
