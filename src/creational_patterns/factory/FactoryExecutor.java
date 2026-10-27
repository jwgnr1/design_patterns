package creational_patterns.factory;

import creational_patterns.factory.documentos.Documentos;
import creational_patterns.factory.fabricas.*;
import interfaces.PadraoExecutor;

public class FactoryExecutor implements PadraoExecutor {

    public void executar() {

        Menu menu = new Menu();

        System.out.println(menu.getmenu());

        FabricaDocumentos fabricaDocumentos = null;
        Documentos documentos;

        switch (menu.opcao()){

            case 1:
                fabricaDocumentos= new FabricaPDF();
                break;

            case 2:
                fabricaDocumentos = new FabricaWord();
                break;

            case 3:
                fabricaDocumentos = new FabricaPlanilha();
                break;

            default:
                System.out.println("Opção Inválida!");
                return;
        }

        documentos = fabricaDocumentos.criarDocumentos();
        documentos.gerar();

    }
}
