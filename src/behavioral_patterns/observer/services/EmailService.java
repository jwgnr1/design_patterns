package behavioral_patterns.observer.services;


import behavioral_patterns.observer.interfaces.PedidoObserver;
import behavioral_patterns.observer.model.Pedido;

public class EmailService implements PedidoObserver {

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("EMAIL: Cliente " + pedido.getCliente().getNome() + " avisado sobre status " + pedido.getStatus());
    }
}
