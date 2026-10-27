package structural_patterns.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Kit implements ItemLoja {
    private String nome;
    private Double preco;
    private List <ItemLoja> listaItemLoja = new ArrayList<>();

    public Kit(String nome){
        this.nome = nome;
        this.preco = preco;
        this.listaItemLoja = listaItemLoja;
    }

    public void adicionar(ItemLoja item){
        listaItemLoja.add(item);
    }

    public void remover(ItemLoja item){
        listaItemLoja.remove(item);
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        Double soma = 0.0;
        for(ItemLoja item : listaItemLoja){
            soma += item.getPreco();
        }
        return soma;
    }

    public void exibir(String prefixo){
        System.out.println(prefixo + "+ " + this.nome);
        for(ItemLoja item: listaItemLoja){
            item.exibir(prefixo + " ");
        }
        if (prefixo.isEmpty()) {
            System.out.println(this.nome + " Total: R$ " + this.getPreco() + "\n");
        }
    }
}
