package creational_patterns.abstractFactory.Kits.Kit_2;


import creational_patterns.abstractFactory.interfaces.NotaFiscal;

public class NotaFiscalInternacional implements NotaFiscal {

    @Override
    public String emitir(String pedidoId) {
        return String.format("NF - INT <%s>", pedidoId);
    }
}
