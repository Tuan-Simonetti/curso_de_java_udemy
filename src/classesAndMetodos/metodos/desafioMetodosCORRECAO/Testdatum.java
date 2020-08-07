package classesAndMetodos.metodos.desafioMetodosCORRECAO;

public class Testdatum {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 19;
        d1.mes = 7;
        d1.ano = 1991;

        var d2 = new Data();
        d2.dia = 17;
        d2.mes = 7;
        d2.ano = 1963;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
