package structural_patterns.bridge;

import interfaces.PadraoExecutor;
import structural_patterns.bridge.exportador.*;
import structural_patterns.bridge.relatorio.*;

public class BridgeExecutor implements PadraoExecutor {
    public void executar() {

        ItemRelatorio produto1 = new ItemRelatorio("structural_patterns.composite.model.Produto A", 50.0);
        ItemRelatorio produto2 = new ItemRelatorio("structural_patterns.composite.model.Produto B", 200.0);
        ItemRelatorio produto3 = new ItemRelatorio("Prodduto C", 150.0);

        Relatorio relatorio1 = new RelatorioFinanceiro(new ExportadorPDF());
        relatorio1.adicionarItem(produto1);
        relatorio1.adicionarItem(produto2);
        relatorio1.adicionarItem(produto3);
        relatorio1.gerar(false);

        Relatorio relatorio2 = new RelatorioFinanceiro(new ExportadorExcel());
        relatorio2.adicionarItem(produto1);
        relatorio2.adicionarItem(produto2);
        relatorio2.adicionarItem(produto3);
        relatorio2.gerar(true);

        Relatorio relatorio3 = new RelatorioVendas(new ExportadorPDF());
        relatorio3.adicionarItem(produto1);
        relatorio3.adicionarItem(produto2);
        relatorio3.adicionarItem(produto3);
        relatorio3.gerar(true);

        Relatorio relatorio4 = new RelatorioVendas(new ExportadorExcel());
        relatorio4.adicionarItem(produto1);
        relatorio4.adicionarItem(produto2);
        relatorio4.adicionarItem(produto3);
        relatorio4.gerar(false);
    }
}