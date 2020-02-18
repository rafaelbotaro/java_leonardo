package orientacaoObjetos.colections;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<ListaUsuarioTeste> usuarios = new HashSet<>();
		
		usuarios.add(new ListaUsuarioTeste("Rafael"));
		usuarios.add(new ListaUsuarioTeste("Renato"));
		usuarios.add(new ListaUsuarioTeste("Ricardo"));
		
		boolean resultado = usuarios.contains(new ListaUsuarioTeste("Rafael"));
		System.out.println(resultado);
		
	}

}
