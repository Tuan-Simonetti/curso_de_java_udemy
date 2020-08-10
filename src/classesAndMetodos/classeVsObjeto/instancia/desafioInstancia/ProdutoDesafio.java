package classesAndMetodos.classeVsObjeto.instancia.desafioInstancia;

import classesAndMetodos.classeVsObjeto.instancia.AreaCirc;

public class ProdutoDesafio {

    String nome;
    double preco;
    double desconto;

    ProdutoDesafio(double precoInformado, double descontoInformado) {
        preco = precoInformado;
        desconto = descontoInformado;
    }

    double desconto() {
        return preco - desconto;
    }
}
