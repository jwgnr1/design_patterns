package creational_patterns.abstractFactory.interfaces;

public interface FornecedorFactory {

    Pagamento criarPagamento();
    Frete criarFrete();
    NotaFiscal criarNotaFiscal();
}
