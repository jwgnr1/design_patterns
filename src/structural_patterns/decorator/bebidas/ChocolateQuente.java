package structural_patterns.decorator.bebidas;


import structural_patterns.decorator.interfaces.Bebida;

public class ChocolateQuente implements Bebida {

    public double getPreco(){
        return 7.0;
    }

    public String getDescricao(){
        return "Chocolate Quente ";
    }
}
