package orientacaoObjetos.colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> adicionam elementos na fila
		// A diferença é o comportamento que ocorre quando a fila está cheia
		
		fila.add("Maria"); // retorna false
		fila.offer("Orides"); // lança uma excessão
		fila.add("Alessandra");
		fila.offer("Rafael");
		fila.add("Morais");
		fila.offer("Ana");
		
		// peek e element -> obtem os próximos elementos da fila (sem remover)
		// diferença é o comportamento que ocorre quando a fila está vazia
			
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma excessão
		System.out.println(fila.element());
		System.out.println();
		
		// fila.size();
		// fila.clear();
		// fila,isEmpty();
		
		// poll e remove -> obte os próximos elementos da fila (e remove)
		// diferença é o comportamento que ocorre quando a fila está vazia
		
		System.out.println(fila.poll()); // imprime sempre o próximo da fila na ordem
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // lança uma excessão
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size();
		// fila.clear();
		// fila,isEmpty();
		// fila.contains(...);
	}

}
