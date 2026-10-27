package behavioral_patterns.visitor.visitors;

import behavioral_patterns.visitor.elements.*;

public class AvaliacaoLimpeza implements VisitanteSetor{

    @Override
    public void visitarAdministrativo(Administrativo adm) {
        System.out.println("AVALIAÇÃO LIMPEZA\n" + "Administrativo\n" + adm.toString()+
                ((limpezaDetalhada(adm.getQtdEquipamentos()))?
                        "Setor com quantidade excessiva de quipamentos. Limpeza detalhada necesária\n" : ""));
    }

    @Override
    public void visitarArmazem(Armazem arm) {
        System.out.println("AVALIAÇÃO LIMPEZA\n" + "Armazém\n" + arm.toString() +
                ((limpezaDetalhada(arm.getQtdEquipamentos()))?
                        "Setor com quantidade excessiva de quipamentos. Limpeza detalhada necesária\n" : ""));
    }

    @Override
    public void visitarFrota(Frota fro) {
        System.out.println("AVALIAÇÃO LIMPEZA\n" + "Frota\n" + fro.toString() +
                ((limpezaDetalhada(fro.getQtdEquipamentos()))?
                        "Setor com quantidade excessiva de quipamentos. Limpeza detalhada necesária\n" : ""));
    }

    @Override
    public void visitarProducao(Producao pro) {
        System.out.println("AVALIAÇÃO LIMPEZA\n" + "Produção\n" + pro.toString() +
                ((limpezaDetalhada(pro.getQtdEquipamentos()))?
                        "Setor com quantidade excessiva de quipamentos. Limpeza detalhada necesária\n" : ""));
    }

    public boolean limpezaDetalhada(int qtdEquipamentos){ //Regra de negócio: Setor com quantidade equipamentos
        return qtdEquipamentos > 30;                         // maior que 30 precisa de limpeza detalhada

    }
}
