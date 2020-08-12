package arrayCollections.arrays;

import java.util.Arrays;

public class EstruturaArray {

    public static void main(String[] args) {

        double [] notasAlunoA = new double[3];                      // Cria-se o array com 3 espaços
        notasAlunoA[0] = 7.9;                                       // Insere o valor ao primeiro espaço;
        notasAlunoA[1] = 8;                                         // Insere o valor ao segundo espaço;
        notasAlunoA[2] = 6.7;                                       // Insere o valor ao terceiro espaço;

        Arrays.toString(notasAlunoA);                               // Converte o Array em String
        System.out.println(notasAlunoA);                            // "Printa" o Array inteiro
        System.out.println(Arrays.toString(notasAlunoA));           // Faz o "Print" do Array já convertendo para String

        double total = 0;                                           // Neste bloco é feita a somatória das notas,
        for(int i = 0; i < 3; i++) {                                // percorrendo os itens definidos no Array.
            total += notasAlunoA[i];
        }
        System.out.println(total / 3);                              // Aqui é feita a média das notas ao final do Looping

        for(int i = 0; i < notasAlunoA.length; i++) {               // Neste bloco é feita a somatória das notas,
            total += notasAlunoA[i];                                // percorrendo os itens definidos no Array.
        }                                                           // Porém, ao invés de percorrer uma quantidade
        System.out.println(total / 3);                              // predefinida, o looping irá acompanhar o crescimento
                                                                    // do Array com a função "notasAlunoA.length".

        final double notaArmazenada4 = 5.9;
        double notaArmazenada0 = 7.8;
        double[] notasAlunoB = {notaArmazenada0, 8.9, notaArmazenada4, 10};                 // uma nova forma de criar um Array
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
