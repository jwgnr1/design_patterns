package behavioral_patterns.strategy.estrategias;


import behavioral_patterns.strategy.interfaces.FormaPagamentoStrategy;

public class Cartao implements FormaPagamentoStrategy {

    @Override
    public double calcularTotal(double valor) {
        return valor + (valor * 0.05);
    }
}
