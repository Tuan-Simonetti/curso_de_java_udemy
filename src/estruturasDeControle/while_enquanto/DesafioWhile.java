package estruturasDeControle.while_enquanto;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        String continuar = "s";
        Scanner entrada = new Scanner(System.in);
        Scanner entrada_aluno = new Scanner(System.in);
        Scanner entrada_nota = new Scanner(System.in);
        double notaDaTurma = 0;
        int quantidadeDeNotas = 0;

        while (continuar.equalsIgnoreCase("s")) {

            System.out.print("Nome do Aluno: ");
            String aluno = entrada_aluno.nextLine();

            System.out.print("Nota: ");
            String notaString = entrada_nota.next();
//            double nota = entrada.nextDouble();

            double nota = Double.parseDouble(notaString);

            if (nota >= 0 && nota < 4.5) {
                System.out.printf("O aluno %s tirou a nota %.2f. Está reprovado.", aluno, nota);
            } else if (nota < 6.0 && nota >=4.5) {
                System.out.printf("O aluno %s tirou a nota %.2f. Está de recuperação.", aluno, nota);
            } else if (nota >= 7.0 && nota <= 8.9) {
                System.out.printf("O aluno %s tirou a nota %.2f. Está aprovado.", aluno, nota);
            } else if (nota < 10.0 && nota >= 9.0) {
                System.out.printf("O aluno %s tirou a nota %.2f. Está aprovado com honras.", aluno, nota);
            } else if (nota == 10.0) {
                System.out.printf("O aluno %s tirou a nota %.2f. É um dos melhores da turma.", aluno, nota);
            } else {
                System.out.printf("A nota informada não é válida. Por favor, tente novamente.");
            }
            quantidadeDeNotas++;
            notaDaTurma += nota;


            System.out.print("Deseja continuar a calcular as médias?[s/n] ");
            continuar = entrada.next();
        }
        double mediaDaTurma = notaDaTurma / quantidadeDeNotas;
        System.out.printf("Foram avaliados %d alunos e a média da turma foi %.2f.", quantidadeDeNotas, mediaDaTurma);
        entrada.close();
    }
}