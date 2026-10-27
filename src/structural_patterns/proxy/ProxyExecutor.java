package structural_patterns.proxy;

import interfaces.PadraoExecutor;

public class ProxyExecutor implements PadraoExecutor {
    public void executar() {

        Conteudo assistirFilme = new FilmePremiumProxy();

        Usuario usuario1 = new Usuario("Carlos", "PREMIUM");
        assistirFilme.assistir(usuario1);

        Usuario usuario2 = new Usuario("Ana", "BASICO");
        assistirFilme.assistir(usuario2);

        Usuario usuario3 = new Usuario("Marina", "PREMIUM");
        assistirFilme.assistir(usuario3);

        Usuario usuario4 = new Usuario("Pedro", "BASICO");
        assistirFilme.assistir(usuario4);

        Usuario usuarioInvalido = new Usuario(null, null);
        try {
            assistirFilme.assistir(usuarioInvalido);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}