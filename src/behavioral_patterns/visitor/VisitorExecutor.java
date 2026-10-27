package behavioral_patterns.visitor;

import behavioral_patterns.visitor.elements.*;
import behavioral_patterns.visitor.visitors.*;
import interfaces.PadraoExecutor;
import java.util.ArrayList;
import java.util.List;

public class VisitorExecutor implements PadraoExecutor {
    public void executar() {

        List<Setor> listaSetores = new ArrayList<>();

        listaSetores.add(new Administrativo(3, "João", "Baixo", 10,
                100, "Bom", false));
        listaSetores.add(new Armazem(5, "Maria", "Baixo", 10,
                50, "Ruim", false));
        listaSetores.add(new Frota(10, "Pedro", "Médio", 10,
                25, "Ruim", true));
        listaSetores.add(new Frota(15, "Luis", "Alto", 20,
                30, "Ruim", true));

        VisitanteSetor avaliacaoLimpeza = new AvaliacaoLimpeza();
        VisitanteSetor inspecaoSeguranca = new InspecaoSeguranca();

        for (Setor setor: listaSetores){
            setor.aceitar(avaliacaoLimpeza);
            setor.aceitar(inspecaoSeguranca);
        }
    }
}