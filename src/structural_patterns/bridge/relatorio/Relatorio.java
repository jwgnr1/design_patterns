package structural_patterns.bridge.relatorio;

import structural_patterns.bridge.exportador.Exportador;

import java.util.ArrayList;
import java.util.List;

public abstract class Relatorio {

    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador){
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item){
        itens.add(item);
    }

    protected double calcularTotal(List <ItemRelatorio> itens){
        double soma = 0;
        for (ItemRelatorio item: itens){
            soma += item.getValor();
        }
        return soma;
    }

    public abstract void gerar(boolean detalhado);

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado){
        if(detalhado == true){
            return itens;
        }
        else{
            List <ItemRelatorio> listafiltrada = new ArrayList<>();
            for (ItemRelatorio item : itens){
                if(item.getValor() >= 100){
                    listafiltrada.add(item);
                }
            }
            return listafiltrada;
        }
    }
}
