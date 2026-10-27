package creational_patterns.singleton.model;

public class Alarme {

    public void tocar() throws IllegalAccessException{
        ControleVolume.getINSTANCE().setVolume(80);
        System.out.println("creational_patterns.singleton.model.Alarme tocando no volume " + ControleVolume.getINSTANCE().getVolume());
    }

    public void parar(){
        System.out.println("creational_patterns.singleton.model.Alarme Parado");
    }
}
