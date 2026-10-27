package structural_patterns.adapter.apis;

public class TvLgApi {

    public void ligarTv(){
        System.out.println("[LG] Ligando TV");
    }

    public void desligarTv(){
        System.out.println("[LG] desligando TV");
    }

    public void aumentarSom(){
        System.out.println("[LG] Aumentando som");
    }

    public void diminuirSom(){
        System.out.println("[LG] Reduzindo som");
    }
}
