package classesAndMetodos.metodos.desafioMetodos;

import java.text.ParseException;

public class Executor {

    public static void main(String[] args) throws ParseException {

        BaseDatas data_1 = new BaseDatas();
        data_1.data = Input.input();
        System.out.println(data_1);


        BaseDatas data_2 = new BaseDatas();
        data_2.data = Input.input();
        System.out.println(data_2);


        BaseDatas data_3 = new BaseDatas();
        data_3.data = Input.input();
        System.out.println(data_3);
    }
}
