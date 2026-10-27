package behavioral_patterns.chain.Middlewares;

import model.Requisicao;

public class PermissaoMiddleware extends Middleware{

    @Override
    public boolean processar(Requisicao req) {
        if(req.getPermissao().equals("ADMIN")){
            return proximo.processar(req);
        }
        else {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }
    }
}
