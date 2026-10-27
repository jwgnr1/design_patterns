import behavioral_patterns.chain.ChainExecutor;
import behavioral_patterns.iterator.IteratorExecutor;
import behavioral_patterns.mediator.MediatorExecutor;
import behavioral_patterns.memento.MementoExecutor;
import behavioral_patterns.observer.ObserverExecutor;
import behavioral_patterns.state.StateExecutor;
import behavioral_patterns.template.TemplateExecutor;
import behavioral_patterns.visitor.VisitorExecutor;
import creational_patterns.abstractFactory.AbstractFactoryExecutor;
import creational_patterns.builder.BuilderExecutor;
import creational_patterns.factory.FactoryExecutor;
import creational_patterns.prototype.CommandExecutor; // atenção: é o executor do PROTOTYPE
import creational_patterns.singleton.SingletonExecutor;
import interfaces.PadraoExecutor;
import structural_patterns.adapter.AdapterExecutor;
import structural_patterns.bridge.BridgeExecutor;
import structural_patterns.composite.CompositeExecutor;
import structural_patterns.decorator.DecoratorExecutor;
import structural_patterns.facade.FacadeExecutor;
import structural_patterns.flyweight.FlyweightExecutor;
import structural_patterns.proxy.ProxyExecutor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static final Scanner SC = new Scanner(System.in);
    private static final Map<String, Map<String, PadraoExecutor>> CATEGORIAS = new LinkedHashMap<>();

    static {
        Map<String, PadraoExecutor> criacionais = new LinkedHashMap<>();
        criacionais.put("Singleton", new SingletonExecutor());
        criacionais.put("Abstract Factory", new AbstractFactoryExecutor());
        criacionais.put("Factory Method", new FactoryExecutor());
        criacionais.put("Builder", new BuilderExecutor());
        criacionais.put("Prototype", new CommandExecutor());

        Map<String, PadraoExecutor> estruturais = new LinkedHashMap<>();
        estruturais.put("Bridge", new BridgeExecutor());
        estruturais.put("Composite", new CompositeExecutor());
        estruturais.put("Decorator", new DecoratorExecutor());
        estruturais.put("Facade", new FacadeExecutor());
        estruturais.put("Flyweight", new FlyweightExecutor());
        estruturais.put("Proxy", new ProxyExecutor());
        estruturais.put("Adapter", new AdapterExecutor());

        Map<String, PadraoExecutor> comportamentais = new LinkedHashMap<>();
        comportamentais.put("Chain of Responsibility", new ChainExecutor());
        comportamentais.put("Command", new CommandExecutor());
        comportamentais.put("Iterator", new IteratorExecutor());
        comportamentais.put("Mediator", new MediatorExecutor());
        comportamentais.put("Memento", new MementoExecutor());
        comportamentais.put("Observer", new ObserverExecutor()::executar);
        comportamentais.put("State", new StateExecutor());
        comportamentais.put("Template Method", new TemplateExecutor());
        comportamentais.put("Visitor", new VisitorExecutor());
        comportamentais.put("Adapter", new AdapterExecutor());

        CATEGORIAS.put("Criacionais", criacionais);
        CATEGORIAS.put("Estruturais", estruturais);
        CATEGORIAS.put("Comportamentais", comportamentais);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== PADRÕES DE PROJETO ===");
            int i = 1;
            for (String categoria : CATEGORIAS.keySet()) {
                System.out.println(i++ + ". " + categoria + " (" + CATEGORIAS.get(categoria).size() + ")");
            }
            System.out.println(i + ". Executar TODOS os padrões");
            System.out.println("0. Sair");

            int escolha = lerOpcao("Escolha: ");

            if (escolha == 0) {
                System.out.println("Até mais!");
                return;
            }
            if (escolha == CATEGORIAS.size() + 1) {
                CATEGORIAS.forEach((categoria, padroes) ->
                        padroes.forEach((nome, executor) -> executar(categoria, nome, executor)));
            } else if (escolha >= 1 && escolha <= CATEGORIAS.size()) {
                String categoria = (String) CATEGORIAS.keySet().toArray()[escolha - 1];
                menuCategoria(categoria, CATEGORIAS.get(categoria));
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuCategoria(String categoria, Map<String, PadraoExecutor> padroes) {
        while (true) {
            System.out.println("\n--- " + categoria.toUpperCase() + " ---");
            int i = 1;
            for (String nome : padroes.keySet()) {
                System.out.println(i++ + ". " + nome);
            }
            System.out.println(i + ". Executar todos desta categoria");
            System.out.println("0. Voltar");

            int escolha = lerOpcao("Escolha: ");

            if (escolha == 0) {
                return;
            }
            if (escolha == padroes.size() + 1) {
                padroes.forEach((nome, executor) -> executar(categoria, nome, executor));
            } else if (escolha >= 1 && escolha <= padroes.size()) {
                String nome = (String) padroes.keySet().toArray()[escolha - 1];
                executar(categoria, nome, padroes.get(nome));
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private static void executar(String categoria, String nome, PadraoExecutor executor) {
        System.out.println("\n==================================================");
        System.out.println(">>> " + nome.toUpperCase() + "  [" + categoria + "]");
        System.out.println("==================================================");
        try {
            executor.executar();
        } catch (Exception e) {
            System.out.println("Erro ao executar " + nome + ": " + e);
        }
        System.out.println("--------------- fim de " + nome + " ---------------");
    }

    private static int lerOpcao(String mensagem) {
        System.out.print(mensagem);
        try {
            return Integer.parseInt(SC.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        } catch (NoSuchElementException e) {
            return 0;
        }
    }
}