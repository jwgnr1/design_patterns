package behavioral_patterns.mediator;

import behavioral_patterns.mediator.Colleagues.*;
import behavioral_patterns.mediator.mediator.*;
import interfaces.PadraoExecutor;


public class MediatorExecutor implements PadraoExecutor {
    public void executar() {

        MediatorClinica mediator = new CentralAtendimentoClinica();

        Paciente paciente = new Paciente(mediator);
        Enfermagem enfermagem = new Enfermagem(mediator);
        Laboratorio laboratorio = new Laboratorio(mediator);
        Medico medico = new Medico(mediator);
        Recepcao recepcao = new Recepcao(mediator);

        mediator.adicionarSetor(paciente);
        mediator.adicionarSetor(enfermagem);
        mediator.adicionarSetor(laboratorio);
        mediator.adicionarSetor(medico);
        mediator.adicionarSetor(recepcao);

        paciente.enviarSolicitacao("Quero realizar o atendimento");
        recepcao.enviarSolicitacao("Encaminhando paciente");
        medico.enviarSolicitacao("Solicito o exame");
        laboratorio.enviarSolicitacao("Informo resultado");
        enfermagem.enviarSolicitacao("Preparando paciente");
        recepcao.enviarSolicitacao("Finalizando atendimento");
    }
}
