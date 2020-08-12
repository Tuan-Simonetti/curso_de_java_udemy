package arrayCollections.foreach;

public class ForEach {

    public static void main(String[] args) {

        double[] notas = { 9.9, 8.7, 7.2, 9.4};

        for(int i = 0; i < notas.length; i++){             // For "normal"
            System.out.println(notas[i]);
        }

        for(double nota: notas) {                          // Foreach
            System.out.println(nota);
        }
    }
}
