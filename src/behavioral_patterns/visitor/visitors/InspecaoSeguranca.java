package behavioral_patterns.visitor.visitors;

import behavioral_patterns.visitor.elements.*;

public class InspecaoSeguranca implements VisitanteSetor{

    @Override
    public void visitarAdministrativo(Administrativo adm) {
        System.out.println("INSPEÇÃO SEGURANÇA\n" + "Administrativo\n" + adm.toString() +
                ((necessidadeSeguranca(adm.getQtdColaboradores()))?
                        "Setor com grande quantidade de colaboradores. Segurança necesária\n" : ""));
    }

    @Override
    public void visitarArmazem(Armazem arm) {
        System.out.println("INSPEÇÃO SEGURANÇA\n" + "Armazém\n" + arm.toString() +
                ((necessidadeSeguranca(arm.getQtdColaboradores()))?
                        "Setor com grande quantidade de colaboradores. Segurança necesária\n" : ""));
    }

    @Override
    public void visitarFrota(Frota fro) {

        System.out.println("INSPEÇÃO SEGURANÇA\n" + "Frota\n" + fro.toString() +
                ((necessidadeSeguranca(fro.getQtdColaboradores()))?
                        "Setor com grande quantidade de colaboradores. Segurança necesária\n" : ""));
    }

    @Override
    public void visitarProducao(Producao pro) {
        System.out.println("INSPEÇÃO SEGURANÇA\n" + "Produção\n" + pro.toString() +
                ((necessidadeSeguranca(pro.getQtdColaboradores()))?
                        "Setor com grande quantidade de colaboradores. Segurança necesária\n" : ""));
    }

    public boolean necessidadeSeguranca(int qtColaboradores){ //Regra de negócio: Setor com quantidade colaboradores
        return qtColaboradores > 5;                             // maior que 5 precisa de uma maior segurança
    }
}
