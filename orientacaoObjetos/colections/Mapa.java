package orientacaoObjetos.colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Rafael");
		usuarios.put(2, "Renato");
		usuarios.put(3, "Ricardo");
		usuarios.put(4, "Roberto");
		usuarios.put(5, "Rudolph");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println();
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println();
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Rafael"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(2));
		System.out.println();
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+ " - ");
			System.out.println(registro.getValue());
		}
	}
}
