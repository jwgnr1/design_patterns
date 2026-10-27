package creational_patterns.builder.pedido;//1. tipo (String): "HAMBURGUER" ou "PIZZA"
//2. tamanho (String): "P", "M", "G"
//3. pagamento (String): "PIX", "CARTAO", "DINHEIRO"
//4. itens (List) — deve ter pelo menos 1 item

//5. tipoPao (String) — obrigatório se tipo = HAMBURGUER
//valores: "BRIOCHE", "TRADICIONAL", "INTEGRAL"
//6. tipoMassa (String) — obrigatório se tipo = PIZZA
//valores: "FINA", "TRADICIONAL", "PAN"
//7. bordaRecheada (boolean) — só faz sentido se tipo = PIZZA
//8. entrega (String): "RETIRADA" ou "DELIVERY"
//9. enderecoEntrega (String) — obrigatório se entrega = DELIVERY
//10. cupom (String) — opcional
//11. observacao (String) — opcional
//12. trocoPara (Double) — opcional, só permitido se pagamento = DINHEIRO

import java.util.List;

public class Pedido {

    private final String tipo;
    private final String tamanho;
    private final String pagamento;
    private final List<ItemPedido> itens;
    private final String tipoPao;
    private final String tipoMassa;
    private final boolean bordaRecheada;
    private final String entrega;
    private final String enderecoEntrega;
    private final String cupom;
    private final String observacao;
    private final Double trocoPara;

    public Pedido(String tipo, String tamanho,
                  String pagamento, List<ItemPedido> itens,
                  String tipoPao, String tipoMassa,
                  boolean bordaRecheada, String entrega,
                  String enderecoEntrega, String cupom,
                  String observacao, Double trocoPara){

        this.tipo = tipo;
        this.tamanho = tamanho;
        this.pagamento = pagamento;
        this.itens = itens;
        this.tipoPao = tipoPao;
        this.tipoMassa = tipoMassa;
        this.bordaRecheada = bordaRecheada;
        this.entrega = entrega;
        this.enderecoEntrega = enderecoEntrega;
        this.cupom = cupom;
        this.observacao = observacao;
        this.trocoPara = trocoPara;

    }

    public String getTipo(){ return tipo;}

    public String getTamanho() {
        return tamanho;
    }

    public String getPagamento() {
        return pagamento;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public String getTipoMassa() {
        return tipoMassa;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public String getEntrega() {
        return entrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public String getCupom() {
        return cupom;
    }

    public String getObservacao() {
        return observacao;
    }

    public Double getTrocoPara() {
        return trocoPara;
    }

    @Override
    public String toString() {
        String resumo = "\n===== PEDIDO CRIADO =====" + "\n" +
                "Tipo = " + tipo + "\n" +
                "Tamanho = " + tamanho + "\n" +
                "Pagamento = " + pagamento + "\n" +
                "Itens = " + itens + "\n";

        if (tipo.equals("HAMBURGUER")) {
            resumo += "TipoPao = " + tipoPao + "\n";
        } else if (tipo.equals("PIZZA")) {
            resumo += "BordaRecheada = " + (bordaRecheada ? "Sim" : "Não") + "\n" +
                    "TipoMassa = " + tipoMassa + "\n";
        }

        if (entrega.equals("DELIVERY")) {
            resumo += "EnderecoEntrega = " + enderecoEntrega + "\n";
        }
            resumo += "Entrega = " + entrega + "\n";

        if(cupom != null) {
            resumo += "Cupom = " + cupom + "\n";
        }

        if(observacao != null) {
            resumo += "Observacao = " + observacao + "\n";
        }

        if (pagamento.equals("DINHEIRO") && trocoPara >= 0) {
            resumo += "TrocoPara = " + trocoPara + "\n";
        }
        return resumo;
    }
}


