package structural_patterns.facade.services;

import structural_patterns.facade.model.Reserva;

public class ComprovanteService {

    public Reserva gerarComprovante(String destino){
        System.out.println("Comprovante gerado");
        return new Reserva(destino);
    }
}
