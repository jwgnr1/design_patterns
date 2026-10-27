package behavioral_patterns.observer.interfaces;

import behavioral_patterns.observer.model.Pedido;

public interface PedidoObserver {
    void atualizar(Pedido pedido);
}
