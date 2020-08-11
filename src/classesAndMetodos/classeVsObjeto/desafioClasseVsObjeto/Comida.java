package classesAndMetodos.classeVsObjeto.desafioClasseVsObjeto;

public class Comida {

    String nome;
    Double peso;


    Comida(String prato, Double pesoPrato) {
        nome = prato;
        peso = pesoPrato;
    }

    Double calorias() {
        double porcentagem = 1.75;
        double cal = (porcentagem/100)*peso;
        return cal;
    }
}
