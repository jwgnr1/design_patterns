package structural_patterns.decorator;


import interfaces.PadraoExecutor;
import structural_patterns.decorator.bebidas.*;
import structural_patterns.decorator.decorators.*;
import structural_patterns.decorator.interfaces.Bebida;


public class DecoratorExecutor implements PadraoExecutor {
    public void executar() {

        Bebida cafe = new Cafe();
        Bebida cafeComLeiteExtra = new LeiteExtraDecorator(cafe);
        System.out.println(cafeComLeiteExtra.getDescricao());
        System.out.println("Preço: " + cafeComLeiteExtra.getPreco());

        Bebida capuccino = new Capuccino();
        Bebida capuccinoComCanelaChantilly = new CanelaDecorator(new ChantillyDecorator(capuccino));
        System.out.println(capuccinoComCanelaChantilly.getDescricao() +
                "\nPreço: " + capuccinoComCanelaChantilly.getPreco());

        ChocolateQuente chocolateQuente = new ChocolateQuente();
        Bebida chocolateComLeiteChantillyCalda = new LeiteExtraDecorator
                (new ChantillyDecorator (new CaldaChocolateDecorator(chocolateQuente)));
        System.out.println(chocolateComLeiteChantillyCalda.getDescricao() +
                "\nPreço: " + chocolateComLeiteChantillyCalda.getPreco());


    }
}