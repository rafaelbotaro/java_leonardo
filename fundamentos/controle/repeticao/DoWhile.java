package fundamentos.controle.repeticao;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String texto = " ";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas... ");
			System.out.print("Quer sair? ");
			texto = leia.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		leia.close();
		
	}

}
