package behavioral_patterns.chain.Middlewares;

import model.Requisicao;

public class AuthMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req){
        System.out.println("===============");
        if(req.getToken().equals("INVALIDO")){
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        } else {
            return proximo.processar(req);
        }

    }
}
