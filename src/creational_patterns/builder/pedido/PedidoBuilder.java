package creational_patterns.builder.pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {

    private String tipo;
    private String tamanho;
    private String pagamento;
    private List<ItemPedido> itens = new ArrayList<>();
    private String tipoPao;
    private String tipoMassa;
    private boolean bordaRecheada;
    private String entrega;
    private String enderecoEntrega;
    private String cupom;
    private String observacao;
    private Double trocoPara;

//    tipoHamburguer() / tipoPizza()
//● tamanhoP() / tamanhoM() / tamanhoG()
//● pagarComPix() / pagarComCartao() / pagarComDinheiro()
//● comTrocoPara(double valor)
//● entregaDelivery(String endereco) / entregaRetirada()
//● tipoPao(String pao)
//● tipoMassa(String massa)
//● comBordaRecheada()
//● semBordaRecheada()
//● addItem(String item)
//● comCupom(String cupom)
//● comObservacao(String obs)
//● build()
    public PedidoBuilder tipoHamburguer() {
        this.tipo = "HAMBURGUER";
        return this;
    }

    public PedidoBuilder tipoPizza() {
        this.tipo = "PIZZA";
        return this;
    }

    public PedidoBuilder tamanhoP(){
        this.tamanho = "P";
        return this;
    }

    public PedidoBuilder tamanhoM(){
        this.tamanho = "M";
        return this;
    }

    public PedidoBuilder tamanhoG(){
        this.tamanho = "G";
        return this;
    }

    public PedidoBuilder pagarComPix(){
        this.pagamento = "PIX";
        return this;
    }

    public PedidoBuilder pagarComCartao(){
        this.pagamento = "CARTÃO";
        return this;
    }

    public PedidoBuilder pagarComDinheiro(){
        this.pagamento = "DINHEIRO";
        return this;
    }

    public PedidoBuilder adicionaritens (String nome){
        this.itens.add(new ItemPedido(nome));
        return this;
    }

    public PedidoBuilder comTipoPao(String tipoPao){
        this.tipoPao = tipoPao;
        return this;
    }

    public PedidoBuilder comTipoMassa(String tipoMassa){
        this.tipoMassa = tipoMassa;
        return this;
    }

    public PedidoBuilder comBordaRecheada(){
        this.bordaRecheada = true;
        return this;
    }

    public PedidoBuilder semBordaRecheada(){
        this.bordaRecheada = false;
        return this;
    }

    public PedidoBuilder entregaDelivery(String enderecoEntrega){
        this.entrega = "DELIVERY";
        this.enderecoEntrega = enderecoEntrega;
        return this;
    }

    public PedidoBuilder entregaRetirada(){
        this.entrega = "RETIRADA";
        return this;
    }

    public PedidoBuilder comCupom(String cupom){
        this.cupom = cupom;
        return this;
    }

    public PedidoBuilder comObservacao(String observacao){
        this.observacao = observacao;
        return this;
    }

    public PedidoBuilder comTrocoPara(Double trocoPara){
        this.trocoPara = trocoPara;
        return this;
    }

    public Pedido build(){
        if(!tipo.equals("HAMBURGUER") && !tipo.equals("PIZZA")) throw new IllegalStateException("Escolha um item válido!");
        if (!tamanho.equals("P") && !tamanho.equals("M") && !tamanho.equals("G")) throw new IllegalStateException("Escolha um tamanho válido!");
        if (!pagamento.equals("PIX") && !pagamento.equals("CARTÃO") && !pagamento.equals("DINHEIRO")) throw new IllegalStateException("Escolha uma forma de pagamento válida!");
        if (itens == null || itens.isEmpty()) throw new IllegalStateException("Precisa de pelo menos 1 item!");

        if(tipo.equals("HAMBURGUER")) {
            if (tipoPao == null) throw new IllegalStateException("Tipo de pão é  obrigatório");
            if (tipoMassa != null) throw new IllegalStateException("Tipo de masa não pode ser escolhido");
            if (bordaRecheada == true) throw new IllegalStateException("O pedido não pode ter esse complemento");
        }

        if(tipo.equals("PIZZA")){
            if(tipoMassa == null) throw new IllegalStateException("Tipo de massa é obrigatório");
            if(tipoPao != null) throw new IllegalStateException("Tipo de pão não pode ser escolhido");
        }

        if(entrega.equals("DELIVERY")){
            if(enderecoEntrega == null || enderecoEntrega.isBlank()) {
                throw new IllegalStateException("Endereço de entrega é obrigatório");
            }
        }

        if(entrega.equals("RETIRADA") && enderecoEntrega != null) throw new IllegalStateException("Endereço de entrega deve ser vázio");

        if(!pagamento.equals("DINHEIRO")){
           if(trocoPara != null) throw new IllegalStateException("Troco só é permitido em pagamento com dinheiro");
        }
        else {
            if(trocoPara!= null && trocoPara <= 0)  throw new IllegalStateException("Troco deve ser maior que 0");
        }
        return new Pedido(tipo, tamanho, pagamento, itens,
                tipoPao, tipoMassa, bordaRecheada, entrega,
                enderecoEntrega, cupom, observacao, trocoPara); //Mudar o return
    }
}

