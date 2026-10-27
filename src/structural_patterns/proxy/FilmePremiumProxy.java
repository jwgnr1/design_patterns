package structural_patterns.proxy;

public class FilmePremiumProxy implements Conteudo {

    private FilmePremium filmePremium;

    public FilmePremiumProxy() {
        this.filmePremium = new FilmePremium();
    }

    @Override
    public void assistir(Usuario usuario){
        if(usuario.getPlano() != null) {
            if (usuario.getPlano().equalsIgnoreCase("PREMIUM")) {
                System.out.println("Acesso liberado para " + usuario.getNome());
                filmePremium.assistir(usuario);
            } else if (usuario.getPlano().equalsIgnoreCase("BASICO")) {
                System.out.println("Acesso negado para: " + usuario.getNome());
            }
        }
        else{
            throw new IllegalArgumentException("Usuário Inválido");
        }
    }
}
