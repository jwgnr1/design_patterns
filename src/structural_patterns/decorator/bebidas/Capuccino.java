package structural_patterns.decorator.bebidas;


import structural_patterns.decorator.interfaces.Bebida;

public class Capuccino implements Bebida {

    @Override
    public double getPreco() {
        return 8.0;
    }

    @Override
    public String getDescricao() {
        return "Capuccino ";
    }
}
