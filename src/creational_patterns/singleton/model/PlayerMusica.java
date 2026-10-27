package creational_patterns.singleton.model;

public class PlayerMusica {

    public void aumentarVolume() throws IllegalAccessException{
        ControleVolume.getINSTANCE().aumentar(10);
    }

    public void diminuirVolume() throws IllegalAccessException{
        ControleVolume.getINSTANCE().aumentar(10);
    }

    public void mostrarVolume(){
        System.out.println("Volume: " + ControleVolume.getINSTANCE().getVolume());
    }
}
