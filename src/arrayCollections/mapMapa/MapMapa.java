package arrayCollections.mapMapa;

import java.util.HashMap;
import java.util.Map;

public class MapMapa {

    public static void main(String[] args) {

        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Adiciona");                        // ADICIONA caso não exista ou SUBSTITUI caso exista
        usuario.put(1, "Substitui");                       // ADICIONA caso não exista ou SUBSTITUI caso exista
        usuario.put(2, "Roberto");                         // ADICIONA caso não exista ou SUBSTITUI caso exista
        usuario.put(3, "Ricardo");                         // ADICIONA caso não exista ou SUBSTITUI caso exista

        System.out.println(usuario.size());
        System.out.println(usuario.isEmpty());

        System.out.println(usuario.keySet());              // Retorna o indice das posicoes
        System.out.println(usuario.values());              // Retorna o indice dos valores
        System.out.println(usuario.entrySet());            // Retorna o indice das posicoes e dos valores


        System.out.println(usuario.containsKey(2));
        System.out.println(usuario.containsValue("Roberto"));

        System.out.println(usuario.get(4));                // Pega um intem conforme o indice informado
        System.out.println(usuario.remove(1));         // Remove o valor no indicie indicado
        System.out.println(usuario.remove(4, "Gui"));      // Vai verificar se a chave o valor existem, se existir é removido


        for(int chave: usuario.keySet()) {
            System.out.println(chave);
        }

        for(String valor: usuario.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuario.entrySet()) {  // Entry são as entradas para o map
            System.out.print(registro.getKey() + " ==> ");
            System.out.print(registro.getValue());
        }
    }
}
