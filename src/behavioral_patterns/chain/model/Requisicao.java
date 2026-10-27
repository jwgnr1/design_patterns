package model;

public class Requisicao{

    private String usuario;
    private String token;
    private String permissao;
    private boolean dadosValidos;

    public Requisicao(String usuario, String token,
                      String permissao, boolean dadosValidos){

        this.usuario = usuario;
        this.token = token;
        this.permissao = permissao;
        this.dadosValidos = dadosValidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public String getPermissao() {
        return permissao;
    }

    public boolean getDadosValidos(){
        return dadosValidos;
    }
}
