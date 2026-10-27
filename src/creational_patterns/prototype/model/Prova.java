package creational_patterns.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List <Questao> questoes;
    public Prova(String titulo, String turma, String data, String versao){
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = new ArrayList<>();
    }

    public Prova copiar(){

        Prova copiaProva = new Prova(this.titulo, this.turma, this.data, this.versao);

        for (Questao e: this.questoes){
            copiaProva.questoes.add(e.copiar());
        }

        return copiaProva;
    }

    public int totalPontos(){
        int total = 0;
        for (Questao q: questoes){
            total += q.getPontos();
        }

        return total;
    }

    public void adicionarQuestao(Questao questao){
        this.questoes.add(questao);
    }

    public void substituirQuestao(String id, Questao nova){
        for(int i = 0; i < questoes.size(); i++){
            if((questoes.get(i).getId().trim()).equals(id.trim())){
                questoes.set(i, nova);
                break;
            }
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTurma(String turma){
        this.turma = turma;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setVersao(String versao){
        this.versao = versao;
    }

    @Override
    public String toString() {
        StringBuilder resumoProva = new StringBuilder();

        resumoProva.append("===== " + titulo + " =====" + "\n" +
                "Turma: " + turma + "\n" +
                "Data: " + data + "\n" +
                "Versão: " + versao + "\n" +
                "Total de pontos: "+ totalPontos());

        return resumoProva.toString();
     }

    public void printResumo(){
        System.out.println(this.toString());

        for(Questao e: questoes){

            System.out.println(e.toString() + "\n");
        }
    }
}
