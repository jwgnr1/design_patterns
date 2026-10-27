package behavioral_patterns.state.interfaces;

import behavioral_patterns.state.model.Chamado;

public interface EstadoChamando {

    void iniciarAtendimento(Chamado chamado);
    void aguardarCliente(Chamado chamado);
    void responderCliente(Chamado chamado);
    void resolver(Chamado chamado);
    void cancelar(Chamado chamado);

}
