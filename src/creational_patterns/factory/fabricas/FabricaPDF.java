package creational_patterns.factory.fabricas;

import creational_patterns.factory.documentos.Documentos;
import creational_patterns.factory.documentos.PDF;

public class FabricaPDF extends FabricaDocumentos{

    @Override
    public Documentos criarDocumentos() {
        return new PDF();
    }
}
