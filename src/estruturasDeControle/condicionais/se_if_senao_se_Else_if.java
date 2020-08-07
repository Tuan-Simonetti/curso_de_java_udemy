package estruturasDeControle.condicionais;

import java.util.Scanner;

public class se_if_senao_se_Else_if {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digita a nota: ");

        double nota = entrada.nextDouble();

        if(nota >= 10 || nota <= 0) {
            System.out.println("Nota válida!");
        }
        else {
            if(nota >= 8.1 && nota < 10.0) {
                System.out.println("Conceito A");
            }
        else if (nota >= 6.1 && nota <= 8.0) {
                System.out.println("Conceito B");
            }
        }

        entrada.close();
    }

}
