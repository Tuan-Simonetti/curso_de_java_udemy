package estruturasDeControle.switch_Estrutura_de_Controle;

public class Switch_sem_break {

    public static void main(String[] args) {

        String faixa = "laranja";

        switch (faixa.toLowerCase()) {
        case "preta":
            System.out.println("Sei o Bassai-Dai...");
        case "marrom":
            System.out.println("Sei o Tekki Shodan");
        case "roxa":
            System.out.println("Sei o Tekki Shodan");
        case "verde":
            System.out.println("Sei o Tekki Shodan");
        case "laranja":
            System.out.println("Sei o Tekki Shodan");
        case "vermelha":
            System.out.println("Sei o Tekki Shodan");
        case "amarela":
            System.out.println("Sei o Tekki Shodan");
        defoult:
            System.out.println("Não sei nada");

        }
    }

}
