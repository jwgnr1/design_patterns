package creational_patterns.abstractFactory.Kits.Kit_1;


import creational_patterns.abstractFactory.interfaces.NotaFiscal;

public class NotaFiscalNacional implements NotaFiscal {

    @Override
    public String emitir(String pedidoId) {
        return String.format("NF - NAC <%s>", pedidoId);
    }
}
