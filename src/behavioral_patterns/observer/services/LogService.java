package behavioral_patterns.observer.services;


import behavioral_patterns.observer.interfaces.PedidoObserver;
import behavioral_patterns.observer.model.Pedido;

public class LogService implements PedidoObserver {

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("LOG: creational_patterns.builder.pedido.Pedido " + pedido.getId() + " alterado para " + pedido.getStatus());
    }
}
