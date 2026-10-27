package creational_patterns.abstractFactory.Kits.Kit_1;


import creational_patterns.abstractFactory.interfaces.Frete;

public class FreteNacional implements Frete {

    @Override
    public double calcularFrete(double pesoKg, String cepDesino) {
        return 15 + (pesoKg * 2.0);
    }
}
