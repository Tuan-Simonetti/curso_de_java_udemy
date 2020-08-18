package arrayCollections.Collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<UsuariosColecoes> lista = new ArrayList<UsuariosColecoes>();

        UsuariosColecoes u1 = new UsuariosColecoes("Ana");
        lista.add(u1);

        lista.add(new UsuariosColecoes("Carlos"));
        lista.add(new UsuariosColecoes("Lia"));
        lista.add(new UsuariosColecoes("Bia"));
        lista.add(new UsuariosColecoes("Manu"));

        System.out.println(lista.get(3));

        System.out.println(lista.get(3)); // acessar pelo índice

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new UsuariosColecoes("Manu")));

        System.out.println("Tem?" + lista.contains(new UsuariosColecoes("Lia")));

        for(UsuariosColecoes u: lista) {
            System.out.println(u);
            System.out.println(u.toString());
            System.out.println(u.nome);
        }
    }
}
