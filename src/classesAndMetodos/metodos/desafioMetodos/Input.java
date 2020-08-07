package classesAndMetodos.metodos.desafioMetodos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input {

    public static Date input() throws ParseException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o dia?");
        String dia = entrada.nextLine();

        System.out.println("Qual o dia?");
        String mes = entrada.nextLine();

        System.out.println("Qual o dia?");
        String ano = entrada.nextLine();

        entrada.close();

        String data = String.format("%d/%d/%d", dia, mes, ano);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        return dataFormatada;
    }
}
