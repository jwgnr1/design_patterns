package creational_patterns.abstractFactory.Kits.Kit_2;

import creational_patterns.abstractFactory.interfaces.Pagamento;

public class PagamentoInternacional implements Pagamento {

    @Override
    public boolean pagar(double valor) {
        System.out.println("[INTERNACIONAL] Pagamento Aprovado com taxa");
        return true;
    }
}
