package creational_patterns.prototype;

import creational_patterns.prototype.model.Prova;
import creational_patterns.prototype.model.Questao;
import interfaces.PadraoExecutor;

public class CommandExecutor implements PadraoExecutor {
    public void executar() {


        Prova template = new Prova("Prova SQL - Template ", "TEMPLATE", "2026-03-10 ", "BASE ");
        Questao questao1 = new Questao("Q1", "Jabuticaba ", 3);
        Questao questao2 = new Questao("Q2", "Banana ", 3);
        Questao questao3 = new Questao("Q3", "Morango ", 4);


        template.adicionarQuestao(questao1);
        template.adicionarQuestao(questao2);
        template.adicionarQuestao(questao3);

        template.printResumo();

        Prova prova1 = template.copiar();

        prova1.setTitulo("Prova 1 — Turma A (V1)");
        prova1.setTurma("2o INFO A");
        prova1.setData("2026-03-20");
        prova1.setVersao("V1");
        prova1.substituirQuestao("Q2", new Questao("Q2", "Abacate", 3));

        prova1.printResumo();

        Prova prova2 = template.copiar();
        prova2.setTitulo("Prova 2 — Turma B (V1)");
        prova2.setTurma("2o INFO B");
        prova2.setData("2026-03-21");
        prova2.setVersao("V1");
        prova2.substituirQuestao("Q3", new Questao("Q3", "Morango ", 5));

        prova2.printResumo();

        System.out.println("===== Validação =====\n");
        prova1.substituirQuestao("Q1", new Questao("Q1", "Framboesa", 5));
        template.printResumo();
        prova1.printResumo();
    }
}