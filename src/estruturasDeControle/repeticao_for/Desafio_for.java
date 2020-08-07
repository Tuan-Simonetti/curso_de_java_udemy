package estruturasDeControle.repeticao_for;

public class Desafio_for {
    public static void main(String[] args) {
        String valor = "#";
        String contador_cinco = "cinco";
        int cinco = contador_cinco.length();
        String contador_um = "u";
        int um = contador_um.length();

        for(int i = um; i <= cinco; i++) {
            System.out.println(valor);
            valor += "#";
        }
        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço!
        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
