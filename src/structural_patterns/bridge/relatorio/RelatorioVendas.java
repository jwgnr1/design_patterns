package structural_patterns.bridge.relatorio;

import structural_patterns.bridge.exportador.Exportador;

import java.util.List;

public class RelatorioVendas extends Relatorio{

    public RelatorioVendas(Exportador exportador){
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List <ItemRelatorio> listaFiltrada = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(listaFiltrada);
        exportador.exportar("Relatório de Vendas", listaFiltrada, total);
    }
}
