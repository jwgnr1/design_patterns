package structural_patterns.bridge.exportador;

import structural_patterns.bridge.relatorio.ItemRelatorio;

import java.util.List;

public interface Exportador {
    void exportar(String titulo, List<ItemRelatorio> itens, double total);
}
