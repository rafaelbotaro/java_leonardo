package orientacaoObjetos.colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> adicionam elementos na fila
		// A diferen�a � o comportamento que ocorre quando a fila est� cheia
		
		fila.add("Maria"); // retorna false
		fila.offer("Orides"); // lan�a uma excess�o
		fila.add("Alessandra");
		fila.offer("Rafael");
		fila.add("Morais");
		fila.offer("Ana");
		
		// peek e element -> obtem os pr�ximos elementos da fila (sem remover)
		// diferen�a � o comportamento que ocorre quando a fila est� vazia
			
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma excess�o
		System.out.println(fila.element());
		System.out.println();
		
		// fila.size();
		// fila.clear();
		// fila,isEmpty();
		
		// poll e remove -> obte os pr�ximos elementos da fila (e remove)
		// diferen�a � o comportamento que ocorre quando a fila est� vazia
		
		System.out.println(fila.poll()); // imprime sempre o pr�ximo da fila na ordem
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // lan�a uma excess�o
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
