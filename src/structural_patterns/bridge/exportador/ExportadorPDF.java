package structural_patterns.bridge.exportador;

import structural_patterns.bridge.relatorio.ItemRelatorio;

import java.util.List;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("\n===== Exportando PDF =====");
        System.out.println("Titulo: " + titulo);

        double soma = 0;
        for (ItemRelatorio item : itens){
            System.out.println("-" + item.getDescricao() + "R$ " + item.getValor());
        }
        System.out.println("Total: " +  total);
        System.out.println("==========================");
    }
}
