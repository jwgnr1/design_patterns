package behavioral_patterns.chain.Middlewares;

import model.Requisicao;

public class ValidacaoMiddleware extends Middleware{

    @Override
    public boolean processar(Requisicao req) {
        if(!req.getDadosValidos()) {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }
        return proximo.processar(req);
    }

}
