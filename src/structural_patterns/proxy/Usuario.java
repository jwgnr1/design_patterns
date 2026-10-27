package structural_patterns.proxy;

public class Usuario {
    private String nome;
    private String plano;

    public Usuario(String nome, String plano){
        System.out.println("===== USUÁRIO =====");
        this.nome = nome;
        this.plano = plano;
    }

    public String getNome(){
        return nome;
    }

    public String getPlano() {
        return plano;
    }
}
