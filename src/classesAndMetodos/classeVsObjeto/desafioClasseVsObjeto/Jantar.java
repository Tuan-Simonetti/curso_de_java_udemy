package classesAndMetodos.classeVsObjeto.desafioClasseVsObjeto;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Strogonoff", 567.98);
        Pessoa p1 = new Pessoa("Zé", 85.87);

        System.out.printf("O número de calorias ingeridas é de: %.2f. \n", c1.calorias());
        System.out.printf("O peso de %s quando chegou era de: %.2f. \n", p1.nome, p1.peso);
        System.out.printf("O peso adquirido por %s é de: %.2f. \n", p1.nome, (p1.peso + c1.calorias()));
    }
}
