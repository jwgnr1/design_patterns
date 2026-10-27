package creational_patterns.builder;
//Caso 1 — Hambúrguer válido (delivery + pix)
//● tipo = HAMBURGUER
//● pão = BRIOCHE
//● tamanho = M
//● itens: “X-Bacon”
//        ● pagamento = PIX
//● entrega = DELIVERY com endereço
//● observação: “sem cebola”
//        ● imprimir resumo

//Caso 2 — Pizza válida (retirada + cartão + borda)
//● tipo = PIZZA
//● massa = FINA
//● tamanho = G
//● itens: “Pizza Calabresa”
//        ● borda recheada = true
//● pagamento = CARTAO
//● entrega = RETIRADA
//● cupom: “10OFF”
//        ● imprimir resumo

//Caso 3 — Dinheiro com troco válido
//● escolha qualquer tipo, mas pagamento = DINHEIRO
//● trocoPara = 100
//        ● imprimir resumo

//Caso 4 — creational_patterns.builder.pedido.Pedido inválido (deve estourar exceção)
//Escolha 1 erro e demonstre:
//        ● pizza sem massa
//● hamburguer sem pão
//● entrega delivery sem endereço
//● pagamento pix com trocoPara
//● borda recheada em hamburguer

import creational_patterns.builder.pedido.Pedido;
import creational_patterns.builder.pedido.PedidoBuilder;
import interfaces.PadraoExecutor;

public class BuilderExecutor implements PadraoExecutor {
    public void executar() {

        try {
            Pedido pedido1 = new PedidoBuilder()
                    .tipoHamburguer()
                    .comTipoPao("BRIOCHE")
                    .tamanhoM()
                    .adicionaritens("X - BACON")
                    .pagarComPix()
                    .entregaDelivery("Rua Marques")
                    .comObservacao("sem cebola")
                    .build();
            System.out.println(pedido1.toString());

        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e);
        }

        try {
            Pedido pedido2 = new PedidoBuilder()
                    .tipoPizza()
                    .comTipoMassa("FINA")
                    .tamanhoG()
                    .adicionaritens("PIZZA CALABRESA")
                    .comBordaRecheada()
                    .pagarComCartao()
                    .entregaRetirada()
                    .comCupom("100FF")
                    .build();

            System.out.println(pedido2.toString());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e);
        }

        try {
            Pedido pedido3 = new PedidoBuilder()
                    .tipoHamburguer()
                    .comTipoPao("FRANCÊS")
                    .tamanhoG()
                    .adicionaritens("MAIONESE")
                    .pagarComDinheiro()
                    .entregaDelivery("Rua João Paulo")
                    .comObservacao("Carne bem passada")
                    .comTrocoPara(27.5)
                    .build();

            System.out.println(pedido3);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e);
        }

        try {
            Pedido pedido4 = new PedidoBuilder()
                    .tipoPizza()
                    .tamanhoG()
                    .adicionaritens("CALABRESA")
                    .pagarComCartao()
                    .entregaRetirada()
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e);
        }
    }
}