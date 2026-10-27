package behavioral_patterns.visitor.elements;


import behavioral_patterns.visitor.visitors.VisitanteSetor;

public class Producao extends SetorBase {

    public Producao(int qtdColaboradores, String responsavel, String nivelRisco, int qtdVeiculos,
                   int qtdEquipamentos, String statusOrganizacao, boolean pendencias) {
        super(qtdColaboradores, responsavel, nivelRisco, qtdVeiculos,
                qtdEquipamentos, statusOrganizacao, pendencias);
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarProducao(this);
    }
}
