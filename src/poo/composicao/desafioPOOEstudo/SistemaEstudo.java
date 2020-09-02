package poo.composicao.desafioPOOEstudo;

public class SistemaEstudo {

    public static void main(String[] args) {
        ClienteEstudo cliente = new ClienteEstudo("Tuan");

        CompraEstudo compra1 = new CompraEstudo();
        compra1.adicionarItem("Notebooke", 3100.80, 1);
        compra1.adicionarItem("Monitor", 1100.80, 2);
        compra1.adicionarItem("Mesa", 450.80, 1);

        CompraEstudo compra2 = new CompraEstudo();
        compra2.adicionarItem("Impressora", 150.60, 1);

        ClienteEstudo cliente2 = new ClienteEstudo("Luiz");
        cliente.compraEstudoList.add(compra1);
        cliente.compraEstudoList.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }

}
