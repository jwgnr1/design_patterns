package creational_patterns.builder.pedido;//● tamanho (P/M/G)
//● tipo (HAMBURGUER ou PIZZA)
//● massa (se for pizza)
//● pão (se for hambúrguer)
//● adicionais (queijo extra, bacon, borda recheada...)
//● observações (ex.: “sem cebola”, “bem passado”)
//● forma de pagamento (PIX, CARTÃO, DINHEIRO)
//● cupom de desconto (opcional)
//● entrega (retirada ou delivery)
//● endereço (obrigatório se for delivery)
//● troco (só se pagamento for dinheiro)

public class ItemPedido {

    private final String nome;

    public ItemPedido(String nome){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}

