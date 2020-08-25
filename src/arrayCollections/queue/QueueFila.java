package arrayCollections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();


        // Offer e Add -> adiciona elementos na fila
        // Diferenca é o comportamento quando a fila está cheia
        fila.add("Ana");           // retorna false.
        fila.offer("Bia");      // lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e element -> obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia
        System.out.println(fila.peek());       // caso a fila esteja vazia, ele retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element());    // caso a fila esteja vazia, ele retorna um log de erro (crasha)
        System.out.println(fila.element());

        fila.size();        // tamanho da fila
        fila.clear();       // limpar fila
        fila.isEmpty();     // saber se está ou não vazia
        fila.contains("Valor");    // Verifica se um valor existe dentro da fila


        System.out.println(fila.poll());    // Pega o primeiro elemento da fila já removendo
        System.out.println(fila.remove());  //

    }
}
