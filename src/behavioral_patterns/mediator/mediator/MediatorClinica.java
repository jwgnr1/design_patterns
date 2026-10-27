package behavioral_patterns.mediator.mediator;


import behavioral_patterns.mediator.Colleagues.Setor;

public interface MediatorClinica {

    public void enviarSolicitacao(String mensagem, Setor setor);
    public void adicionarSetor(Setor setor);
}
