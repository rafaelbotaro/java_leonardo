package fundamentos.conversoesTipos;

import java.util.Scanner;

public class TiposStringEquals {
	
	public static void main(String[] args) {
		
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nDigite o número 2: ");
		String s2 = leia.nextLine();
		System.out.println("2" == s2.trim()); // usar == é errado
		System.out.println("2".equals(s2.trim())); // usar equals é o certo
		
		leia.close();
		
	}

}
