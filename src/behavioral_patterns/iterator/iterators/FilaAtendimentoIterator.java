package iterators;

import colecao.FilaAtendimento;
import dominio.SenhaAtendimento;

import java.util.ArrayList;
import java.util.List;

public class FilaAtendimentoIterator implements  IteratorSenha{

    private List<SenhaAtendimento> senhas;
    private int posicao = 0;

    public FilaAtendimentoIterator(List<SenhaAtendimento> senhas){
        this.senhas = senhas;
    }

    @Override
    public boolean temProxima() {
        return posicao < senhas.size();
    }

    @Override
    public SenhaAtendimento proxima() {
        SenhaAtendimento senha = senhas.get(posicao);
        posicao ++;
        return senha;
    }
}
