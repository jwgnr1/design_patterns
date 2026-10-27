package creational_patterns.abstractFactory.factories;


import creational_patterns.abstractFactory.Kits.Kit_2.FreteInternacional;
import creational_patterns.abstractFactory.Kits.Kit_2.NotaFiscalInternacional;
import creational_patterns.abstractFactory.Kits.Kit_2.PagamentoInternacional;
import creational_patterns.abstractFactory.interfaces.FornecedorFactory;
import creational_patterns.abstractFactory.interfaces.Frete;
import creational_patterns.abstractFactory.interfaces.NotaFiscal;
import creational_patterns.abstractFactory.interfaces.Pagamento;

public class FornecedorInternacionalFactory implements FornecedorFactory {

    @Override
    public Frete criarFrete() {
        return new FreteInternacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalInternacional();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoInternacional();
    }
}
