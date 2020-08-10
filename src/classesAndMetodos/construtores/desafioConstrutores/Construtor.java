package classesAndMetodos.construtores.desafioConstrutores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Construtor {
    Input diaInformado;
    Input mesInformado;
    Input anoInformado;

    Construtor() {
        String dia = "1";
        String mes = "1";
        String ano = "1970";
    }

    Construtor(Input dia, Input mes, Input ano){
         diaInformado = dia;
         mesInformado = mes;
         anoInformado = ano;
    }

    public static Date conversor(Input dia, Input mes, Input ano) throws ParseException {
        String data = String.format("%d/%d/%d", dia, mes, ano);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dateFormatada = formato.parse(data);
        return dateFormatada;
    }
}
