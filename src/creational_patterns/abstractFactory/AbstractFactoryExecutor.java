package creational_patterns.abstractFactory;

import creational_patterns.abstractFactory.factories.FornecedorInternacionalFactory;
import creational_patterns.abstractFactory.factories.FornecedorNacionalFactory;
import interfaces.PadraoExecutor;

public class AbstractFactoryExecutor implements PadraoExecutor {

    public void executar(){

        CheckoutService checkoutServiceNacional = new CheckoutService(new FornecedorNacionalFactory());
        CheckoutService checkoutServiceInternacional = new CheckoutService(new FornecedorInternacionalFactory());

        checkoutServiceNacional.finalizarCompra("165895689", 19.0,60.0, "58530-000");
        checkoutServiceInternacional.finalizarCompra("239746152", 45.0, 50.0, "14445-000" );
    }
}