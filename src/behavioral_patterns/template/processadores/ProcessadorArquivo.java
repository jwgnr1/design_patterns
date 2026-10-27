package behavioral_patterns.template.processadores;

public abstract class ProcessadorArquivo {

    public final void processarArquivo() {
        abrirArquivo();
        validarEstrutura();
        lerDados();
        processarDados();
        salvarResultado();
        fecharArquivo();
    }

    protected void abrirArquivo(){
        System.out.println("Abrindo arquivo...");
    }

    protected abstract void validarEstrutura();

    protected abstract void lerDados();

    protected abstract void processarDados();

    protected void salvarResultado(){
        System.out.println("Resultado salvo");
    }

    protected void fecharArquivo(){
        System.out.println("Fechando arquivo...\n");
    }

    public abstract String toString();
}
