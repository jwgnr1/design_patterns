package creational_patterns.factory.documentos;

public class PDF implements Documentos {

    @Override
    public void gerar() {
        System.out.println("== TESTE: PDF == \n" +
                "Gerando documento PDF... \n");
    }
}
