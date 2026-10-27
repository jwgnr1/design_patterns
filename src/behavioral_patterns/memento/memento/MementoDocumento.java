package behavioral_patterns.memento.memento;

import java.time.LocalDateTime;

public class MementoDocumento {

    private String titulo;
    private String conteudo;
    private String autor;
    private LocalDateTime dataHora;
    private int versao;

    public MementoDocumento(String titulo, String conteudo, String autor,
                     LocalDateTime dataHora, int versao){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.dataHora = dataHora;
        this.versao = versao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public int getVersao() {
        return versao;
    }
}
