package creational_patterns.factory.documentos;

public class Word implements Documentos {

    @Override
    public void gerar() {
        System.out.println("== TESTE: documentos.Word == \n" +
                "Gerando documento Word... \n");
    }
}
