package behavioral_patterns.memento.originator;

import behavioral_patterns.memento.memento.MementoDocumento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Documento {

    private String titulo;
    private String conteudo;
    private String autor;
    private LocalDateTime dataHora;
    private int versao;

    private DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Documento(String titulo, String conteudo, String autor,
                     LocalDateTime dataHora, int versao){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.dataHora = dataHora;
        this.versao = versao;

    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public MementoDocumento salvar(){
        System.out.println("Versão Salva!\n");
        return new MementoDocumento(titulo, conteudo, autor,
                dataHora, versao);
    }

    public void restaurar(MementoDocumento versao){
        this.titulo = versao.getTitulo();
        this.conteudo = versao.getConteudo();
        this.autor = versao.getAutor();
        this.dataHora = versao.getDataHora();
        this.versao = versao.getVersao();

        System.out.println("Versão Restaurada!\n");
        mostrarEstado();

    }

    public void mostrarEstado(){
        System.out.println("Versão: " + versao + " | " + " Data e hora: " + dataHora.format(dataHoraFormatada) + "\n" +
                "Titulo: " + titulo + " | " + " Autor: " + autor + "\n" + conteudo + "\n");
    }
}
