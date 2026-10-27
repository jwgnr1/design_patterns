package creational_patterns.singleton;

import creational_patterns.singleton.model.Alarme;
import creational_patterns.singleton.model.BotaoFisicoVolume;
import creational_patterns.singleton.model.ControleVolume;
import creational_patterns.singleton.model.PlayerMusica;
import interfaces.PadraoExecutor;

public class SingletonExecutor implements PadraoExecutor {
    public void executar() {

        ControleVolume a = ControleVolume.getINSTANCE();
        ControleVolume b = ControleVolume.getINSTANCE();

        System.out.println("===== TESTE 1 =====");
        System.out.println("Mesma instância? " + (a == b));

        BotaoFisicoVolume botao = new BotaoFisicoVolume();
        PlayerMusica playerMusica = new PlayerMusica();
        Alarme alarme = new Alarme();

        System.out.println("\n===== TESTE 2 =====");

        playerMusica.mostrarVolume();

        try {
            botao.pressionarMais();
            botao.pressionarMais();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());;
        }

        playerMusica.mostrarVolume();

        System.out.println("\n===== TESTE 3 =====");


        try {
            alarme.tocar();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        playerMusica.mostrarVolume();

        System.out.println("\n===== TESTE 4 =====");

        ControleVolume.getINSTANCE().mutar();

        playerMusica.mostrarVolume();

        try {
            ControleVolume.getINSTANCE().setVolume(95);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        playerMusica.mostrarVolume();

        try {
            botao.pressionarMais();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        playerMusica.mostrarVolume();

        try {
            botao.pressionarMais();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        playerMusica.mostrarVolume();
    }
}
