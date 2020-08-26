package arrayCollections.stackPilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno Príncipe");      // Retorna o valor boolean
        livros.push("Don Quixote");         // Retorna uma exceção caso ocorra restrições
        livros.push("O Hobbit");

        System.out.println(livros.peek());     // Usado para recuperar ou buscar o primeiro elemento do topo da pilha
        System.out.println(livros.element());  // Se não existir elementos, retornará Null

        // ForEach
        for(String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.pop());      // Retorna o item do topo da pilha e, depois, é removido
        System.out.println(livros.poll());     // Retorna Null se a pilha estiver vazia
        System.out.println(livros.remove());   // Remove o primeiro item da pilha


    }
}
