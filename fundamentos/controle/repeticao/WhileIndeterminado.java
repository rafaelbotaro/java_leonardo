package fundamentos.controle.repeticao;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		String valor = " ";
		
		Scanner leia = new Scanner(System.in);
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			valor = leia.nextLine();
		}
		leia.close();
	}
	
}