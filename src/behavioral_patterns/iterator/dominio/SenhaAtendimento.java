package dominio;

public class SenhaAtendimento {

    private String id;
    private String nome;
    private String atendimento;

    public SenhaAtendimento(String id, String nome, String atendimento){
        this.id = id;
        this.nome = nome;
        this.atendimento = atendimento;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAtendimento() {
        return atendimento;
    }

    @Override
    public String toString() {
        return "Senha: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Atendimento: " + atendimento + "\n";
    }
}
