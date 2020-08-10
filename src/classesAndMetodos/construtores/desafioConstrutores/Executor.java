package classesAndMetodos.construtores.desafioConstrutores;

import java.util.Date;

public class Executor {
    public static void main(String[] args) {

        Construtor p1 = new Construtor();
        Construtor p2 = new Construtor();
        Construtor p3 = new Construtor();

        System.out.printf("%d/%d/%d\n", p1.diaInformado, p1.mesInformado, p1.anoInformado);
        System.out.printf("%d/%d/%d\n", p2.diaInformado, p2.mesInformado, p2.anoInformado);
        System.out.printf("%d/%d/%d\n", p3.diaInformado, p3.mesInformado, p3.anoInformado);
    }
}

// construtor padrão retornará "01/01/1970"
// Esta versão está inacabada, porque a classe Input não está sendo chamada e está retornando "null"