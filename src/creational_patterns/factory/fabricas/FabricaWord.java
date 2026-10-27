package creational_patterns.factory.fabricas;

import creational_patterns.factory.documentos.Documentos;
import creational_patterns.factory.documentos.Word;

public class FabricaWord extends FabricaDocumentos {

    @Override
    public Documentos criarDocumentos() {
        return new Word();
    }
}
