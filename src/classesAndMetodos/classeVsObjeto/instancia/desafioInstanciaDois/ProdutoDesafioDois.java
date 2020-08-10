package classesAndMetodos.classeVsObjeto.instancia.desafioInstanciaDois;

public class ProdutoDesafioDois {
    String nome;
    double preco;
    static double desconto;

    ProdutoDesafioDois() {}

    ProdutoDesafioDois(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}
