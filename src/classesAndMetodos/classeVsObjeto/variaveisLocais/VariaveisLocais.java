package classesAndMetodos.classeVsObjeto.variaveisLocais;

public class VariaveisLocais {

    int dia;
    int mes;
    int ano;

//    Data() {
//        // dia = 1;
//        // mes = 1;
//        // ano = 1970;
//        this(1, 1, 1970);
//        this(dia, mes, ano);
//    }

//    Data(int dia, int mes, int ano) {
//        this.dia = dia;
//        this.mes = mes;
//        this.ano = ano;
//    }

    String obterDataFormatada() {
        String formato = "%d/%d/%d"; // Variavel local
        return String.format(formato, this.dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
        System.out.println(this.obterDataFormatada());
    }
}
