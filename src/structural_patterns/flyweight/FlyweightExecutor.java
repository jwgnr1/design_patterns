package structural_patterns.flyweight;

import interfaces.PadraoExecutor;
import structural_patterns.flyweight.BlocoFactory;
import structural_patterns.flyweight.TipoBloco;

public class FlyweightExecutor implements PadraoExecutor {
    public void executar() {
        TipoBloco pedra1 = BlocoFactory.getBloco("Pedra", "Pedra.png", true);
        TipoBloco pedra2 = BlocoFactory.getBloco("Pedra", "Pedra.png", true);
        pedra1.exibir(10,64,20);
        pedra1.exibir(11,64,20);
        pedra1.exibir(12,64,20);

        TipoBloco grama = BlocoFactory.getBloco("Grama", "Grama.png", true);
        grama.exibir(15,64,22);
        grama.exibir(16,64,22);

        TipoBloco madeira = BlocoFactory.getBloco("Madeira", "Madeira.png", true);
        madeira.exibir(30,65,10);

        System.out.println("\npedra1 e pedra2 são o mesmo objeto? " + ((pedra1 == pedra2)? "Sim" : "Não"));
    }
}