package behavioral_patterns.chain.Middlewares;

import model.Requisicao;

public class LogMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        System.out.println("LOG: Requisição processada");
        return proximo.processar(req);
    }
}
