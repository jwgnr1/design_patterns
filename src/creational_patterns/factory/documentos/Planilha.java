package creational_patterns.factory.documentos;

public class Planilha implements Documentos {

    @Override
    public void gerar() {
        System.out.println("== TESTE: PLANILHA == \n" +
                "Gerando documento Planilha... \n");
    }
}
