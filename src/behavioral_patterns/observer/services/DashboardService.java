package behavioral_patterns.observer.services;


import behavioral_patterns.observer.interfaces.PedidoObserver;
import behavioral_patterns.observer.model.Pedido;

public class DashboardService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("DASHBOARD: Atualizando painel do pedido " + pedido.getId() + " com status " + pedido.getStatus());
    }
}
