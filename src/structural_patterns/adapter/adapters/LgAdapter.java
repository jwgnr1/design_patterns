package structural_patterns.adapter.adapters;


import structural_patterns.adapter.apis.TvLgApi;
import structural_patterns.adapter.interfaces.ControleUniversal;

public class LgAdapter implements ControleUniversal {

    private final TvLgApi tv;

    public LgAdapter(TvLgApi tv){
        this.tv = tv;
    }

    @Override
    public void ligar() {
        tv.ligarTv();
    }

    public void desligar(){
        tv.desligarTv();
    }

    public void aumentarVolume(){
        tv.aumentarSom();
    }

    public void diminuirVolume(){
        tv.diminuirSom();
    }
}
