package orientacaoObjetos.colections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Java");
		livros.add("Python");
		livros.add("Php");
		
		for (String livro: livros) {
			System.out.println(livro);
		}
		System.out.println();
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println();
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.remove());
		
	}

}
