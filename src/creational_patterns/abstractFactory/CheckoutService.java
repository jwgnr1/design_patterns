package creational_patterns.abstractFactory;

import creational_patterns.abstractFactory.interfaces.FornecedorFactory;
import creational_patterns.abstractFactory.interfaces.Frete;
import creational_patterns.abstractFactory.interfaces.NotaFiscal;
import creational_patterns.abstractFactory.interfaces.Pagamento;

public class CheckoutService {

    private final Pagamento pagamento;
    private final Frete frete;
    private final NotaFiscal notaFiscal;

    public CheckoutService(FornecedorFactory factory){
        this.frete = factory.criarFrete();
        this.notaFiscal = factory.criarNotaFiscal();
        this.pagamento = factory.criarPagamento();
    }

    public void finalizarCompra(String pedidoId, double valorProdutos, double pesoKg, String cepDestino){

        System.out.printf("[== CHECKOUT pedido PED-%s ==]", pedidoId);

        double freteTotal = frete.calcularFrete(pesoKg,cepDestino);
        double somaTotal = valorProdutos + freteTotal;
        String nfId = notaFiscal.emitir(pedidoId);

        System.out.print("\nFrete calculado: " + freteTotal + "\n" +
                "Total: " + somaTotal + "\n");
                pagamento.pagar(somaTotal);
        System.out.println("NF gerada: " + nfId + "\n" +
                "Compra Finalizada!\n");
    }

}
