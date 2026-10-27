package behavioral_patterns.template.processadores;

public class ProcessadorProdutos extends ProcessadorArquivo{

    private String codigo;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public  ProcessadorProdutos(String codigo, String descricao, double preco, int quantidadeEstoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    protected void validarEstrutura() {
        System.out.println("PRODUTO: Validando Estrutura");
    }

    @Override
    protected void lerDados() {
        System.out.println("PRODUTO: Lendo dados...\n" +
                this.toString());
    }

    @Override
    protected void processarDados() {
        System.out.println("PRODUTO: Procenssando dados");
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n" +
               "Descrição: " + descricao + "\n" +
               "Preço: " + preco + "\n" +
               "Quantidade em estoque: " + quantidadeEstoque;
    }
}
