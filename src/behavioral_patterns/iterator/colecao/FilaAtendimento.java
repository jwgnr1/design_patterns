package colecao;

import dominio.SenhaAtendimento;
import iterators.FilaAtendimentoIterator;
import iterators.IteratorSenha;

import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {

    private List<SenhaAtendimento> senhas = new ArrayList<>();

    public void adicionarSenhas(SenhaAtendimento novaSenha){
        senhas.add(novaSenha);
    }

    public IteratorSenha percorrerFila(){
        return new FilaAtendimentoIterator(senhas);
    }

    public List<SenhaAtendimento> getSenhas() {
        return senhas;
    }
}
