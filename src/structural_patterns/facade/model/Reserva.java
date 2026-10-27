package structural_patterns.facade.model;

public class Reserva {

    private String destino;
    private String codigo;

    public Reserva(String destino){
        this.destino = destino;
        this.codigo = "RES 123";
    }

    public String getDestino() {
        return destino;
    }

    public String getCodigo(){
        return codigo;
    }
}
