package classesAndMetodos.classeVsObjeto.desafioClasseData;

public class Data_Teste {

    public static void main(String[] args) {

        Data_Base p1 = new Data_Base();
        p1.dia = 3;
        p1.mes = 8;
        p1.ano = 2020;

        Data_Base p2 = new Data_Base();
        p2.dia = 19;
        p2.mes = 7;
        p2.ano = 1991;

        Data_Base p3 = new Data_Base();
        p3.dia = 17;
        p3.mes = 7;
        p3.ano = 1963;

        System.out.printf("%d/%d/%d\n", p1.dia, p1.mes, p1.ano);
        System.out.printf("%d/%d/%d\n", p2.dia, p2.mes, p2.ano);
        System.out.printf("%d/%d/%d\n", p3.dia, p3.mes, p3.ano);
    }
}
