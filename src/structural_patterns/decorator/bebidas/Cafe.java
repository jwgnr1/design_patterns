package structural_patterns.decorator.bebidas;


import structural_patterns.decorator.interfaces.Bebida;

public class Cafe implements Bebida {

    @Override
    public double getPreco() {
        return 5.0;
    }

    @Override
    public String getDescricao() {
        return "Café ";
    }
}
