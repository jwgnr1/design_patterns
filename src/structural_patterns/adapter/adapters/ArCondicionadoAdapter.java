package structural_patterns.adapter.adapters;


import structural_patterns.adapter.apis.ArCondicionadoApi;
import structural_patterns.adapter.interfaces.ControleUniversal;

public class ArCondicionadoAdapter implements ControleUniversal {

    private final ArCondicionadoApi arcondicionado;

    public ArCondicionadoAdapter(ArCondicionadoApi arcondicionado){
        this.arcondicionado = arcondicionado;
    }

    public void ligar(){
        arcondicionado.iniciar();
    }

    public void desligar(){
        arcondicionado.encerrar();
    }

    @Override
    public void aumentarVolume() {
        arcondicionado.aumentarTemperatura();
    }

    @Override
    public void diminuirVolume() {
        arcondicionado.diminuirtemperatura();
    }
}
