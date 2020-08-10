package classesAndMetodos.construtores.desafioConstrutores;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static Integer input() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o dia?");
        String diaInformado = entrada.nextLine();
        Integer dia = Integer.parseInt(diaInformado);


        System.out.println("Qual o dia?");
        String mesInformado = entrada.nextLine();
        Integer mes = Integer.parseInt(mesInformado);

        System.out.println("Qual o dia?");
        String anoInformado = entrada.nextLine();
        Integer ano = Integer.parseInt(anoInformado);

        entrada.close();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(dia);
        list.add(mes);
        list.add(ano);
        // fiz um array, porque o "return" não estava aceitando o retorno das variaves separadamente

        Integer datum = Integer.parseInt(String.valueOf(list));
        // fiz a conversão de "ArrayList" para "Integer"

        return datum;
    }
}
