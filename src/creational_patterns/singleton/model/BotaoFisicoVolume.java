package creational_patterns.singleton.model;

public class BotaoFisicoVolume {

    public void pressionarMais() throws IllegalAccessException{
        ControleVolume.getINSTANCE().aumentar(5);
    }

    public void pressionarMenos() throws IllegalAccessException{
        ControleVolume.getINSTANCE().diminuir(5);
    }
}
