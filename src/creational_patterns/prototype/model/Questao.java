package creational_patterns.prototype.model;

public class Questao {

    private String id;
    private String enunciado;
    private int pontos;

    public Questao(String id, String enunciado, int pontos){
        this.id = id;
        this.enunciado = enunciado;
        this.pontos = pontos;
    }

    public Questao copiar(){
        return new Questao(
                this.id,
                this.enunciado,
                this.pontos
        );
    }

    public String getId(){
        return id;
    }

    public int getPontos(){
        return pontos;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Enunciado: " + enunciado + "\n" + "Pontos: " + pontos;
    }

}
