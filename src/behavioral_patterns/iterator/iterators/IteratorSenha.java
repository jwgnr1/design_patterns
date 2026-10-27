package iterators;

import dominio.SenhaAtendimento;

public interface IteratorSenha {
    boolean temProxima();
    SenhaAtendimento proxima();
}
