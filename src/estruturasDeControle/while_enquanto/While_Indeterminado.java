package estruturasDeControle.while_enquanto;

import java.util.Scanner;

public class While_Indeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }

}
