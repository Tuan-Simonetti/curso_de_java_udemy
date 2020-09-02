package poo.composicao.desafioPOOEstudo;

import java.util.ArrayList;
import java.util.List;

public class CompraEstudo {

    List<ItemEstudo> itemEstudoList = new ArrayList<>();

    void adicionarItem(ProdutoEstudo p, int quantidade) {
        this.itemEstudoList.add(new ItemEstudo(p, quantidade));
    }

    void adicionarItem(String nome, Double preco, int quantidade) {
        this.itemEstudoList.add(new ItemEstudo(new ProdutoEstudo(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0;

        for(ItemEstudo item: itemEstudoList) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

}
