package poo.enumerateEnum;

public class Jogo {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.x=10;
        jogador1.y=10;

        Jogador jogador2 = new Jogador();
        jogador2.x=10;
        jogador2.y=11;

        System.out.println(jogador1.vida);
        System.out.println(jogador2.vida);

        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);

        System.out.println(jogador1.vida);
        System.out.println(jogador2.vida);
    }
}
