package orientacaoObjetos.colections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<ListaUsuarioTeste> lista = new ArrayList<>();
		
		ListaUsuarioTeste u1 = new ListaUsuarioTeste("Ana");
		lista.add(u1);
		
		lista.add(new ListaUsuarioTeste("Carlos"));
		lista.add(new ListaUsuarioTeste("Lia"));
		lista.add(new ListaUsuarioTeste("Bia"));
		lista.add(new ListaUsuarioTeste("Manu"));
		lista.add(new ListaUsuarioTeste("Manu"));
		
		System.out.println(lista.get(3)); // � poss�vel acessar pelo �ndice		
		System.out.println("Nome exclu�do: "+lista.remove(1));
		System.out.println();
		
		System.out.println(lista.remove(new ListaUsuarioTeste("Manu")));
		System.out.println(lista.remove(new ListaUsuarioTeste("Manu")));
		System.out.println(lista.remove(new ListaUsuarioTeste("Manu")));
		
		System.out.println("Tem? "+ lista.contains(new ListaUsuarioTeste("Lia")));
		System.out.println("Tem? "+ lista.contains(u1));
		
		for (ListaUsuarioTeste u: lista) {
			System.out.println(u.nome);
		}

	}

}
