package uml.animal;

/**
 * Class comments go here...
 *
 * @author João Vicente L. F. Machado
 * @version 1.0 06/08/2020
 */
public class Cachorro extends Animal implements Domesticavel {
    private String nome;

    @Override
    public void setNome(final String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void acariciar() {
        System.out.println("Acariciando o cachorro");
    }

}
