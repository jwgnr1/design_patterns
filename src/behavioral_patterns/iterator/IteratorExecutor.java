package behavioral_patterns.iterator;

import colecao.FilaAtendimento;
import dominio.SenhaAtendimento;
import interfaces.PadraoExecutor;
import iterators.IteratorSenha;

public class IteratorExecutor implements PadraoExecutor {
    public void executar() {

        FilaAtendimento filaAtendimento = new FilaAtendimento();

        filaAtendimento.adicionarSenhas(new SenhaAtendimento("12345", "João", "Prioritário"));
        filaAtendimento.adicionarSenhas(new SenhaAtendimento("67890", "Maria", "Normal"));
        filaAtendimento.adicionarSenhas(new SenhaAtendimento("13579", "Pedro", "Financeiro"));
        filaAtendimento.adicionarSenhas(new SenhaAtendimento("24680", "Antônio", "Agendamento"));
        filaAtendimento.adicionarSenhas(new SenhaAtendimento("10293", "Bia", "Suporte"));

        IteratorSenha iterator = filaAtendimento.percorrerFila();

        while (iterator.temProxima()){
            System.out.println("Chamando...\n" +
                    iterator.proxima().toString());
        }

    }
}