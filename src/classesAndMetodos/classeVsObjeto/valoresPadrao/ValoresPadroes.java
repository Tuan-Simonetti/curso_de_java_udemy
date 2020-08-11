package classesAndMetodos.classeVsObjeto.valoresPadrao;

public class ValoresPadroes {

    int dia;
    int mes;
    int ano;

    //Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        //this(1, 1, 1970);
        //this(dia, mes, ano);

        // byte, short, int, long -> Por padrão o valor será 0 (zero), quando não se define nada
        // float, double -> Por padrão o valor será 0.0 (zero ponto zero), quando não se define nada
        // boolean -> Por padrão o valor será false, quando não se define nada
        // char -> Por padrão será o primeiro elemento da tabela unicode '\u0000', quando não se define nada
        // Objetos -> Exemplo String por padrão o valor será null, quando não se define nada
        // null -> não aponta para nenhum lugar na memória

        //int a;
        //System.out.println(a); Não será possível executar, porque variavel local não é inicializada por padrão, por estar fora dos metodos.
    //}

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
