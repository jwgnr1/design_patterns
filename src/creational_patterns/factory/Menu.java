package creational_patterns.factory;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    private String menu =
            "===== TESTE =====\n" +
            "\n1 - PDF\n" +
            "2 - Word\n" +
            "3 - Planilha\n";

    public String getmenu(){
        return menu;
    }

    public int opcao(){
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        return opcao;

    }
}
