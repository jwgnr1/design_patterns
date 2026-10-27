package structural_patterns.decorator.decorators;

import structural_patterns.decorator.interfaces.Bebida;

public class CanelaDecorator implements Bebida {

    private final Bebida bebida;

    public CanelaDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Canela ";
    }
}
