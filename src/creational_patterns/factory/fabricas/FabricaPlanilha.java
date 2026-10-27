package creational_patterns.factory.fabricas;

import creational_patterns.factory.documentos.Documentos;
import creational_patterns.factory.documentos.Planilha;

public class FabricaPlanilha extends FabricaDocumentos {

    @Override
    public Documentos criarDocumentos() {
        return new Planilha();
    }
}
