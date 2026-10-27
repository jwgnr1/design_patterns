package creational_patterns.singleton.model;

public class ControleVolume {

    private static final ControleVolume INSTANCE = new ControleVolume();

    private int volume;

    private ControleVolume(){
        this.volume = 50;
    }

    public static ControleVolume getINSTANCE() {
        return INSTANCE;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalAccessException{
        if (volume > 100){
            throw new IllegalAccessException("Passo deve ser < 100");
        }else if (volume < 0){
            throw new IllegalAccessException("Passo deve ser > 0");
        }
        this.volume = volume;
    }

    public void aumentar(int passo) throws IllegalAccessException{

        if (this.volume + passo > 100){
            this.volume = 100;
            throw new IllegalAccessException("Passo deve ser < 100");
        }
        this.volume += passo;

    }

    public void diminuir(int passo) throws IllegalAccessException{

        if(this.volume - passo < 0){
            this.volume = 0;
            throw new IllegalAccessException("Passo deve ser > 0");
        }
        this.volume -= passo;
    }

    public void mutar() { this.volume = 0; }
}
