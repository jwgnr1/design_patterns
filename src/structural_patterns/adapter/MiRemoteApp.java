package structural_patterns.adapter;

import structural_patterns.adapter.interfaces.ControleUniversal;

public class MiRemoteApp{

    private final ControleUniversal controle;

    public MiRemoteApp(ControleUniversal controle){
        System.out.println("==========");
        this.controle = controle;
    }

    public void iniciar() {
        System.out.println("[MI REMOTE] Pronto! Iniciando...");
        controle.ligar();
        controle.aumentarVolume();
    }

    public void encerrar(){
        System.out.println("[MI REMOTE] Pronto! Encerrando...");
        controle.diminuirVolume();
        controle.desligar();
    }

}
