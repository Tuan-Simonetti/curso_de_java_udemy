package poo.composicao.desafioPOOEstudo;

import java.util.ArrayList;
import java.util.List;

public class ClienteEstudo {

    String nome;
    List<CompraEstudo> compraEstudoList = new ArrayList<>();

    ClienteEstudo(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(CompraEstudo compraEstudo) {
        this.compraEstudoList.add(compraEstudo);
    }

    double obterValorTotal() {
        double total = 0;

        for(CompraEstudo compraAtual: compraEstudoList){
            total += compraAtual.obterValorTotal();
        }

        return total;
    }

}
