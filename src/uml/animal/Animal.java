package uml.animal;

/**
 * Class comments go here...
 *
 * @author João Vicente L. F. Machado
 * @version 1.0 06/08/2020
 */
public class Animal {

    private int idade;
    private int idadeMinima;
    private int idadeMaxima;

    public int getIdade() {
        return idade;
    }
    public void setIdade(final int idade) {
        this.idade = idade;
    }
    public int getIdadeMaxima() {
        return idadeMaxima;
    }
    public void setIdadeMaxima(final int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }
    public int getIdadeMinima() {
        return idadeMinima;
    }
    public void setIdadeMinima(final int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public void andar() {
        System.out.println("Animal Andou");
    }
    public void falar() {
        System.out.println("Animal Falou");
    }

}
