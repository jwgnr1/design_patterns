package behavioral_patterns.template.processadores;

public class ProcessadorClientes extends ProcessadorArquivo{

    private String nome;
    private String CPF;
    private String telefone;
    private String email;

    public ProcessadorClientes(String nome, String CPF, String telefone, String email){
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    protected void validarEstrutura() {
        System.out.println("CLIENTE: Validando Estrutura");
    }

    @Override
    protected void lerDados() {
        System.out.println("CLIENTE: Lendo dados...\n" +
                this.toString());
    }

    @Override
    protected void processarDados() {
        System.out.println("CLIENTE: Processando dados");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + CPF + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email;
    }
}
