package behavioral_patterns.visitor.elements;

import behavioral_patterns.visitor.visitors.VisitanteSetor;

public abstract class SetorBase implements Setor{

    private int qtdColaboradores;
    private String responsavel;
    private String nivelRisco;
    private int qtdVeiculos;
    private int qtdEquipamentos;
    private String statusOrganizacao;
    private boolean pendencias;
    public SetorBase(int qtdColaboradores, String responsavel, String nivelRisco, int qtdVeiculos,
                     int qtdEquipamentos, String statusOrganizacao, boolean pendencias){
        this.qtdColaboradores = qtdColaboradores;
        this.responsavel = responsavel;
        this.nivelRisco = nivelRisco;
        this.qtdVeiculos = qtdVeiculos;
        this.qtdEquipamentos = qtdEquipamentos;
        this.statusOrganizacao = statusOrganizacao;
        this.pendencias = pendencias;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQtdColaboradores() {
        return qtdColaboradores;
    }

    public String getNivelRisco() {
        return nivelRisco;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }

    public int getQtdEquipamentos() {
        return qtdEquipamentos;
    }

    public String getStatusOrganizacao() {
        return statusOrganizacao;
    }

    public boolean isPendencias() {
        return pendencias;
    }

    public abstract void aceitar(VisitanteSetor visitante);

    @Override
    public String toString() {
        return "Quantidade de colaboradores: " + qtdColaboradores + "\n" +
                "Responsável: " + responsavel + "\n" +
                "Nivel de risco: " + nivelRisco + "\n" +
                "Quantidade de veículos: " + qtdVeiculos + "\n" +
                "Quantidade de Equipamentos: " + qtdEquipamentos + "\n" +
                "Status de Organização: " + statusOrganizacao + "\n" +
                "Há pendências?: " + ((pendencias)? "Sim": "Não")  + "\n";
    }
}
