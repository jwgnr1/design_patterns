package behavioral_patterns.state.model;


import behavioral_patterns.state.interfaces.EstadoChamando;
import behavioral_patterns.state.states.EstadoAberto;

public class Chamado {
    private String codigo;
    private String descricao;
    private String solicitante;
    private EstadoChamando estadoAtual;

    public Chamado(String codigo, String descricao, String solicitante){
        this.codigo = codigo;
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.estadoAtual = new EstadoAberto();
    }

    public void iniciarAtendimento() {
        estadoAtual.iniciarAtendimento(this);
    }

    public void aguardarCliente(){
        estadoAtual.aguardarCliente(this);
    }

    public void responderCliente(){
        estadoAtual.responderCliente(this);
    }

    public void resolver(){
        estadoAtual.resolver(this);
    }

    public void cancelar(){
        estadoAtual.cancelar(this);
    }

    public void setEstadoAtual(EstadoChamando estadoAtual){
        this.estadoAtual = estadoAtual;
    }

    public String getCodigo() {
        return codigo;
    }
    public String toString(){
        return "\nChamado: " + codigo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Solicitante: "+ solicitante;
    }
}
