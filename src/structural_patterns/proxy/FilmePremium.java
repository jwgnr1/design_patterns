package structural_patterns.proxy;

public class FilmePremium implements Conteudo{

    public void assistir(Usuario usuario){
        System.out.println("Reproduzindo filme premium para: " + usuario.getNome());
    }
}
