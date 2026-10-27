package behavioral_patterns.observer.model;



import behavioral_patterns.observer.interfaces.PedidoObserver;
import behavioral_patterns.observer.interfaces.PedidoSubject;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubject {

    private String id;
    private String status;
    private Cliente cliente;
    private List<PedidoObserver> observadores = new ArrayList<>();

    public Pedido(String id, String status, Cliente cliente){
        this.id = id;
        this.status = status;
        this.cliente = cliente;
    }

    @Override
    public void adicionarObserver(PedidoObserver observer) {
        observadores.add(observer);
    }

    @Override
    public void removerObserver(PedidoObserver observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (PedidoObserver e: observadores){
            e.atualizar(this);
        }
    }

    public void atualizarStatus(String novoStatus){

        if(novoStatus.isEmpty()){
            throw new IllegalArgumentException("Status inválido");
        }

        System.out.println("\n==============\n");
        System.out.println("Status do pedido alterado para: " + novoStatus);
        this.status = novoStatus;
        notificarObservers();
    }

    public String getId(){
        return id;
    }

    public String getStatus(){
        return status;
    }

    public Cliente getCliente(){
        return cliente;
    }
}
