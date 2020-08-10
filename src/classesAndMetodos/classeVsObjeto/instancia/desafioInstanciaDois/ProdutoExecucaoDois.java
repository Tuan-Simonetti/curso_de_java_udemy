package classesAndMetodos.classeVsObjeto.instancia.desafioInstanciaDois;

import classesAndMetodos.classeVsObjeto.instancia.desafioInstancia.ProdutoDesafio;

public class ProdutoExecucaoDois {
    public static void main(String[] args) {

        ProdutoDesafioDois p1 = new ProdutoDesafioDois("Notebook", 4356.89);

        var p2 = new ProdutoDesafioDois();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        ProdutoDesafioDois.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
    }
}
