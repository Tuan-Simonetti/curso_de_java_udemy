package estruturasDeControle.condicionais;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um numero de 1 a 7 e retornaremos qual dia da semana se corresponde: ");
        int dia = entrada.nextInt();

        if (dia == 1) {
            System.out.print("O numero 1 corresponde à Domingo");
        } else if (dia == 2) {
            System.out.print("O numero 2 corresponde à segunda-feira");
        } else if (dia == 3) {
            System.out.print("O numero 3 corresponde à terca-feira");
        } else if (dia == 4) {
            System.out.print("O numero 4 corresponde à quarta-feira");
        } else if (dia == 5) {
            System.out.print("O numero 5 corresponde à quinta-feira");
        } else if (dia == 6) {
            System.out.print("O numero 6 corresponde à sexta-feira");
        } else if (dia == 7) {
            System.out.print("O numero 7 corresponde à sábado");
        } else {
            System.out.print("O numero informado não corresponde à um dia.");
        }
        entrada.close();
    }
}
