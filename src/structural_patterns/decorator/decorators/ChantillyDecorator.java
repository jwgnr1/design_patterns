package structural_patterns.decorator.decorators;

import structural_patterns.decorator.interfaces.Bebida;

public class ChantillyDecorator implements Bebida {

    private final Bebida bebida;

    public ChantillyDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 3.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly ";
    }
}
