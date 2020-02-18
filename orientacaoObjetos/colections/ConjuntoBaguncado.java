package orientacaoObjetos.colections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho do conjunto "+conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println("Tamanho do conjunto "+conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho do conjunto "+conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet(); //podemos usar HashSet ou somente Set
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //uni�o entre dois conjuntos
		conjunto.retainAll(nums); //intersec��o de dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); //limpa todo o conjunto tornado-o vazio
		System.out.println(conjunto);
		
	}

}
