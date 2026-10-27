package structural_patterns.bridge.relatorio;

public class ItemRelatorio {
    public String descricao;
    public Double valor;

    public ItemRelatorio(String descricao, Double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
