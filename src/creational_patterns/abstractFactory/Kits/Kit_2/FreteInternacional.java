package creational_patterns.abstractFactory.Kits.Kit_2;


import creational_patterns.abstractFactory.interfaces.Frete;

public class FreteInternacional implements Frete {

    @Override
    public double calcularFrete(double pesoKg, String cepDesino) {
        return 40 +(pesoKg * 5.0);
    }
}
