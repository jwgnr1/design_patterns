package structural_patterns.decorator.decorators;

import structural_patterns.decorator.interfaces.Bebida;

public class LeiteExtraDecorator implements Bebida {

    private final Bebida bebida;

    public LeiteExtraDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite Extra ";
    }
}
