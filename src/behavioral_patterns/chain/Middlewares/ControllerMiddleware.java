package behavioral_patterns.chain.Middlewares;

import model.Requisicao;

public class ControllerMiddleware extends Middleware{

    @Override
    public boolean processar(Requisicao req) {
        System.out.println("CONTROLLER: Requisição processada com sucesso");
        return false;
    }
}
