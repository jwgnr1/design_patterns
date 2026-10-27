package structural_patterns.facade;

import interfaces.PadraoExecutor;
import structural_patterns.facade.facade.ViagemFacade;
import structural_patterns.facade.model.Cliente;

public class FacadeExecutor implements PadraoExecutor {
    public void executar() {

        ViagemFacade viagemFacade = new ViagemFacade();

        Cliente cliente = new Cliente("João", "joao@gamail.com");
        viagemFacade.reservaViagem(cliente, "Recife");

        Cliente cliente2 = new Cliente("Maria", "maria@gmail");
        viagemFacade.reservaViagem(cliente2, "São Paulo");
    }
}