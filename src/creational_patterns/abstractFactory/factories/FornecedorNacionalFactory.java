package creational_patterns.abstractFactory.factories;


import creational_patterns.abstractFactory.Kits.Kit_1.FreteNacional;
import creational_patterns.abstractFactory.Kits.Kit_1.NotaFiscalNacional;
import creational_patterns.abstractFactory.Kits.Kit_1.PagamentoNacional;
import creational_patterns.abstractFactory.interfaces.FornecedorFactory;
import creational_patterns.abstractFactory.interfaces.Frete;
import creational_patterns.abstractFactory.interfaces.NotaFiscal;
import creational_patterns.abstractFactory.interfaces.Pagamento;

public class FornecedorNacionalFactory implements FornecedorFactory {

    @Override
    public Frete criarFrete() {
        return new FreteNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalNacional();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoNacional();
    }
}

