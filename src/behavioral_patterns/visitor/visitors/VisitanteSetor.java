package behavioral_patterns.visitor.visitors;
import behavioral_patterns.visitor.elements.*;

public interface VisitanteSetor {

    void visitarAdministrativo(Administrativo adm);
    void visitarArmazem(Armazem arm);
    void visitarFrota(Frota fro);
    void visitarProducao(Producao pro);
}
