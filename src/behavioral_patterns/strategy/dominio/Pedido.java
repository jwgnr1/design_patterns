package behavioral_patterns.strategy.dominio;


import behavioral_patterns.strategy.interfaces.FormaPagamentoStrategy;

public class Pedido {

    private Double total;
    private FormaPagamentoStrategy formaPagamentoStrategy;

    public Pedido(Double total, FormaPagamentoStrategy formaPagamentoStrategy){
        this.total = total;
        this.formaPagamentoStrategy = formaPagamentoStrategy;

    }
    public Double calcularTotal(){
        return formaPagamentoStrategy.calcularTotal(total) ;
    }

    public void alterarEstrategia(FormaPagamentoStrategy novaEstrategia){
        System.out.println("\nAlterando forma de pagamento...");
        this.formaPagamentoStrategy = novaEstrategia;
    }
}
