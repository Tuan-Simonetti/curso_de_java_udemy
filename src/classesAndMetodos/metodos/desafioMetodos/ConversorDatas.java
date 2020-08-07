package classesAndMetodos.metodos.desafioMetodos;

public class ConversorDatas {

    String obterDataFormatada(String dia, String mes, String ano) {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
