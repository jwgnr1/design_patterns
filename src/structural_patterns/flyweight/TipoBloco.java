package structural_patterns.flyweight;

public class TipoBloco implements Bloco{
    private String nome;
    private String textura;
    private boolean solido;

    public TipoBloco(String nome, String textura, boolean solido){
        this.nome = nome;
        this.textura = textura;
        this.solido = solido;
    }

    @Override
    public void exibir(int x, int y, int z) {
        System.out.println("Bloco: " + nome + " | textura: " + textura + " | sólido: " + solido +
                " | posição: " + "(" + x + ", " + y + ", " + z + ")");
    }
}
