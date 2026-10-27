package behavioral_patterns.observer.interfaces;

public interface PedidoSubject {

    void adicionarObserver(PedidoObserver observer);
    void removerObserver(PedidoObserver observer);
    void notificarObservers();
}
