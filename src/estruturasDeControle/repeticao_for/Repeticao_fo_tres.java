package estruturasDeControle.repeticao_for;

public class Repeticao_fo_tres {
    public static void maind(String[] args) {

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++){
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}
