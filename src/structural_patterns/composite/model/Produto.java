package structural_patterns.composite.model;

public class Produto implements ItemLoja {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.print(prefixo + "- structural_patterns.composite.model.Produto: " + this.nome + " | Preço: R$ " + this.preco + "\n");
    }
}
