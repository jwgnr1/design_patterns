package behavioral_patterns.chain;

import behavioral_patterns.chain.Middlewares.*;
import interfaces.PadraoExecutor;

public class ChainExecutor implements PadraoExecutor {

    @Override
    public void executar() {

        Middleware authMiddleware = new AuthMiddleware();
        Middleware logMiddleware = new LogMiddleware();
        Middleware permissaoMiddleware = new PermissaoMiddleware();
        Middleware validacaoMiddleware = new ValidacaoMiddleware();
        Middleware controllerMiddleware = new ControllerMiddleware();

        authMiddleware.setProximo(permissaoMiddleware);
        permissaoMiddleware.setProximo(validacaoMiddleware);
        validacaoMiddleware.setProximo(logMiddleware);
        logMiddleware.setProximo(controllerMiddleware);

        model.Requisicao req = new model.Requisicao("admin", "valido", "ADMIN", true);
        model.Requisicao req2 = new model.Requisicao("admin", "INVALIDO", "ADMIN", true);
        model.Requisicao req3 = new model.Requisicao("admin", "valido", "", true);
        model.Requisicao req4 = new model.Requisicao("admin", "valido", "ADMIN", false);

        authMiddleware.processar(req);
        authMiddleware.processar(req2);
        authMiddleware.processar(req3);
        authMiddleware.processar(req4);
    }

}
