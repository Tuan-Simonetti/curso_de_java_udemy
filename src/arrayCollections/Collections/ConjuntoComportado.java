package arrayCollections.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set lista = new HashSet();
//        lista.add(1.2);
//        Set<String> lista = new HashSet<>(); // segue a ordem inversa de inserção dos dados.
//        Set<String> lista = new TreeSet<>(); // segue a ordem de inserção dos dados.
//        TreeSet<String> lista = new TreeSet<>(); // segue a ordem de inserção dos dados.
        SortedSet<String> lista = new TreeSet<>(); // segue a ordem de inserção dos dados.

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");

        for(String candidato: lista) {
            System.out.println(candidato);
        }


        Set<Integer> listaDois = new HashSet<>(); // segue a ordem de inserção dos dados.
        listaDois.add(1);
        listaDois.add(2);
        listaDois.add(120);
        listaDois.add(6);

        for(int n: listaDois) {
            System.out.println(n);
        }
    }
}
