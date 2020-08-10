package classesAndMetodos.classeVsObjeto.instancia.desafioInstancia;

import classesAndMetodos.classeVsObjeto.operacoesPonto.Produto;

public class ProdutoExecucao {

    public static void main(String[] args) {

        //        int a = 3;
        //        Scanner entrada = new Scanner(System.in);
        //        Produto p1 = new Produto();

        double descontinhoReais = 50.00;

        ProdutoDesafio p1 = new ProdutoDesafio(3100.95, descontinhoReais);

        var p2 = new ProdutoDesafio(124.85, descontinhoReais);

        System.out.println(p1.desconto());
        System.out.println(p2.desconto());
    }
}
