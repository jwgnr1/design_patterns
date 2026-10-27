package structural_patterns.adapter.adapters;


import structural_patterns.adapter.apis.TvSamsungApi;
import structural_patterns.adapter.interfaces.ControleUniversal;

public class SamsungAdapter implements ControleUniversal {

    private final TvSamsungApi tv;

    public SamsungAdapter(TvSamsungApi tv){
        this.tv = tv;
    }

    @Override
    public void ligar() {
        tv.powerOn();
    }

    @Override
    public void desligar() {
        tv.powerOff();
    }

    @Override
    public void aumentarVolume() {
        tv.volUp();
    }

    @Override
    public void diminuirVolume() {
        tv.volDown();
    }
}
