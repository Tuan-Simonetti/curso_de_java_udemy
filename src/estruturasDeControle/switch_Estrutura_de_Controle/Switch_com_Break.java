package estruturasDeControle.switch_Estrutura_de_Controle;

import java.util.Scanner;

public class Switch_com_Break {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();
        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            default:
                conceito = "não informado!";
        }
        System.out.println("Conceito é " + conceito);
        entrada.close();
    }
}
