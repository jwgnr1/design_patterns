package structural_patterns.facade.services;

import structural_patterns.facade.model.Cliente;
import structural_patterns.facade.model.Reserva;

public class NotificacaoService {

    public void enviarConfirmacao(Cliente cliente, Reserva reserva){
        System.out.println("Confirmação enviada para " + cliente.getEmail() + " | código: " + reserva.getCodigo());
    }
}
