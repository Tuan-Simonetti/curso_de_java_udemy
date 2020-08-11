package classesAndMetodos.classeVsObjeto.referencia.desafioReferencia;

public class ReferenciaDesafio {

    int a = 3; //não pode mexer aqui
    static int b = 4;

    public static void main(String[] args) {

        ReferenciaDesafio a1 = new ReferenciaDesafio();
        System.out.print(a1.a);

        System.out.println(b);
    }
}
