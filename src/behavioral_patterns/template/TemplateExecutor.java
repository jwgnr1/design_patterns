package behavioral_patterns.template;

import behavioral_patterns.template.processadores.*;
import interfaces.PadraoExecutor;

import java.time.LocalDate;

public class TemplateExecutor implements PadraoExecutor {
    public void executar() {

        ProcessadorArquivo processadorC = new ProcessadorClientes("João", "111.111.111 - 11",
                "22222 - 2222", "joao@gmail.com");
        processadorC.processarArquivo();

        ProcessadorArquivo processadorP = new ProcessadorProdutos("12345", "Tela",
                19.5, 2);

        processadorP.processarArquivo();

        ProcessadorArquivo processadorV = new ProcessadorVendas(LocalDate.of(2025,02,03),
                "Tela", 2, 39.0);

        processadorV.processarArquivo();
    }
}