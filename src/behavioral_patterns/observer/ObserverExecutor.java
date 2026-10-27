package behavioral_patterns.observer;

import behavioral_patterns.observer.model.Cliente;
import behavioral_patterns.observer.model.Pedido;
import behavioral_patterns.observer.services.*;
import interfaces.PadraoExecutor;

public class ObserverExecutor implements PadraoExecutor {
    public void executar() {

        Cliente cliente = new Cliente("Anderson", "anderson@gmail.com");
        Pedido pedido = new Pedido("PED - 001", "", cliente);

        pedido.adicionarObserver(new EmailService());
        pedido.adicionarObserver(new LogService());
        pedido.adicionarObserver(new DashboardService());
        pedido.adicionarObserver(new EstoqueService());
        pedido.adicionarObserver(new FaturamentoService());


        pedido.atualizarStatus("PAGO");
        pedido.atualizarStatus("EM_SEPARACAO");
        pedido.atualizarStatus("ENVIADO");
        pedido.atualizarStatus("CANCELADO");
    }
}