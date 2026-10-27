package structural_patterns.adapter.apis;

public class ArCondicionadoApi {

    public void iniciar(){
        System.out.println("[AR CONDICIONADO] Ligado");
    }

    public void encerrar(){
        System.out.println("[AR CONDICIONADO] Desligado");
    }

    public void aumentarTemperatura(){
        System.out.println("[AR CONDICIONADO] Temperatura aumentada");
    }

    public void diminuirtemperatura(){
        System.out.println("[AR CONDICIONADO] Temperatura diminuida");
    }
}
