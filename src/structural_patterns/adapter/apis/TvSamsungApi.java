package structural_patterns.adapter.apis;

public class TvSamsungApi {

    public void powerOn(){
        System.out.println("[SAMSUNG] POWER ON");
    }

    public void powerOff(){
        System.out.println("[SAMSUNG] POWER OFF");
    }

    public void volUp(){
        System.out.println("[SAMSUNG] VOL +");
    }

    public void volDown(){
        System.out.println("[SAMSUNG] VOL -");
    }
}
