package fundamentos.input;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite o sua idade: ");
        int idade = entrada.nextInt();

        // entrada.nextDouble();

        // System.out.println("\n\nNome: " + nome + "" + sobrenome);
        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();
    }
}
