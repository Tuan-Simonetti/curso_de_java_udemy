package poo.composicao.desafioPOO;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itemList = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itemList.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, Double preco, int quantidade) {
        this.itemList.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item: itemList) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
