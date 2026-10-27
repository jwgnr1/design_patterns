package behavioral_patterns.strategy;

import behavioral_patterns.strategy.dominio.*;
import behavioral_patterns.strategy.estrategias.*;
import interfaces.PadraoExecutor;

public class StrategyExecutor implements PadraoExecutor {
    public void executar() {

        Pedido pedido1 = new Pedido(200.0, new Cartao());
        System.out.println("Total no Cartão: " + pedido1.calcularTotal());

        Pedido pedido2 = new Pedido(200.0, new Pix());
        System.out.println("Total no Pix: " + pedido2.calcularTotal());

        Pedido pedido3 = new Pedido(200.0, new Boleto());
        System.out.println("Total no Boleto: " + pedido3.calcularTotal());

        pedido1.alterarEstrategia(new Pix());
        System.out.println("Novo total no Pix: " + pedido1.calcularTotal());
    }
}