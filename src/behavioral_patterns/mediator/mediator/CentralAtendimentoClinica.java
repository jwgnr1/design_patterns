package behavioral_patterns.mediator.mediator;


import behavioral_patterns.mediator.Colleagues.*;

public class CentralAtendimentoClinica implements MediatorClinica {

    private Recepcao recepcao;
    private Paciente paciente;
    private Enfermagem enfermagem;
    private Medico medico;
    private Laboratorio laboratorio;

    @Override
    public void adicionarSetor(Setor setor) {

        switch (setor) {

            case Recepcao e -> this.recepcao = e;

            case Paciente e -> this.paciente = e;

            case Enfermagem e -> this.enfermagem = e;

            case Medico e -> this.medico = e;

            case Laboratorio e -> this.laboratorio = e;

            default -> System.out.println("Setor desconhecido");
        }
    }

    public void enviarSolicitacao(String mensagem, Setor setor) {

        switch (setor) {

            case Paciente p -> {
                if (mensagem.contains("Quero realizar o atendimento")) {
                    recepcao.receberSolicitacao(mensagem);
                }
            }

            case Recepcao r -> {
                if (mensagem.contains("Encaminhando paciente")) {
                    medico.receberSolicitacao(mensagem);
                }
                else if (mensagem.contains("Finalizando atendimento")) {
                    paciente.receberSolicitacao(mensagem);
                }
            }

            case Medico m -> {
                if (mensagem.contains("Solicito o exame")) {
                    laboratorio.receberSolicitacao(mensagem);
                }
            }

            case Laboratorio l -> {
                if (mensagem.contains("Informo resultado")) {
                    enfermagem.receberSolicitacao(mensagem);
                }
            }

            case Enfermagem enf -> {
                if (mensagem.contains("Preparando paciente")) {
                    recepcao.receberSolicitacao(mensagem);
                }
            }

            default -> System.out.println("Setor desconhecido");
        }
    }
}
