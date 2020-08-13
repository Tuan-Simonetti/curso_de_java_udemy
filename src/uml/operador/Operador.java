package uml.operador;

public class Operador {

    private Integer id;
    private String nome;
    private NivelEnum nivel;




    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public NivelEnum getNivel() {
        return nivel;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(NivelEnum nivel) {
        this.nivel = nivel;
    }


}
