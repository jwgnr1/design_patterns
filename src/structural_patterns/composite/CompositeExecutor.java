package structural_patterns.composite;

import interfaces.PadraoExecutor;
import structural_patterns.composite.model.Kit;
import structural_patterns.composite.model.Produto;

public class CompositeExecutor implements PadraoExecutor {
    public void executar() {

        Produto produto1 = new Produto("Mouse", 80.0);
        Produto produto2 = new Produto("Teclado", 150.0);
        Produto produto3 = new Produto("Monitor", 900.0);
        Produto produto4 = new Produto("Mousepad", 40.0);


        Kit kit1 = new Kit("structural_patterns.composite.model.Kit Periféricos");
        kit1.adicionar(produto1);
        kit1.adicionar(produto2);
        kit1.adicionar(produto4);

        Kit kit2 = new Kit("structural_patterns.composite.model.Kit Setup");
        kit2.adicionar(produto3);
        kit2.adicionar(kit1);

        kit1.exibir("");
        kit2.exibir("");
    }
}