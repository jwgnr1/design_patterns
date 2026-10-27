package behavioral_patterns.chain.Middlewares;

import model.Requisicao;

public abstract class Middleware{

    protected Middleware proximo;

    public void setProximo(Middleware proximo){
        this.proximo = proximo;
    }

    public abstract boolean processar (Requisicao req);
}
