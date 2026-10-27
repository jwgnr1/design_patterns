package creational_patterns.abstractFactory.Kits.Kit_1;


import creational_patterns.abstractFactory.interfaces.Pagamento;

public class PagamentoNacional implements Pagamento {

    @Override
    public boolean pagar(double valor) {

        System.out.println("[NACIONAL]\n" +
                "Pagamento aprovado");
        return true;
    }
}
