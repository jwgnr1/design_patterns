package behavioral_patterns.template.processadores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProcessadorVendas extends ProcessadorArquivo{

    private LocalDate dataVenda;
    private String produtoVendido;
    private int quantidade;
    private double valorTotal;

    private static final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ProcessadorVendas(LocalDate dataVenda, String produtoVendido,
                             int quantidade, double valorTotal){
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    @Override
    protected void validarEstrutura() {
        System.out.println("VENDA: Validando Estrutura");
    }

    @Override
    protected void lerDados() {
        System.out.println("VENDA: Lendo dados...\n" +
                this.toString());
    }

    @Override
    protected void processarDados() {
        System.out.println("VENDA: Processando dados");
    }

    public String toString() {
        String dataFormatada = ((dataVenda != null)? dataVenda.format(formatador) : "Insira uma data");
        return "Data: " + dataFormatada + "\n" +
                "structural_patterns.composite.model.Produto: " + produtoVendido + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Total: " + valorTotal;
    }
}
