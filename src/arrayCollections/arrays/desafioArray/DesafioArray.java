package arrayCollections.arrays.desafioArray;

// Calcular a média das notas dos alunos.


import java.util.ArrayList;
import java.util.Scanner;

public class DesafioArray {

    static String continuar = "s";

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String aluno = entrada.nextLine();

        ArrayList notas = new ArrayList();

        while (continuar.equalsIgnoreCase("s")) {
            System.out.printf("Nota do aluno %s : ", aluno);
            String notaInformada = entrada.next();
            notas.add(notaInformada);

            System.out.print("Deseja inserir mais notas?[s/n] ");
            String continuar = entrada.next();

            if (continuar.equalsIgnoreCase("n")) {
                break;
            }
        }

        int contador = 0;
        double total = 0;
        for(Object o: notas) {
            String i = o.toString();
            Double nota = Double.parseDouble(i);
            total = total + nota;
            contador++;
        }

        double media = total/contador;
//        System.out.print(media);
        System.out.printf("A média do aluno %s é: %.2f.", aluno, media);

        entrada.close();
    }
}
